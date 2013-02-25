package me.grison.jtoml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;

import me.grison.jtoml.antlr.TomlBaseListener;
import me.grison.jtoml.antlr.TomlLexer;
import me.grison.jtoml.antlr.TomlParser;
import me.grison.jtoml.antlr.TomlParser.BooleanContext;
import me.grison.jtoml.antlr.TomlParser.DateContext;
import me.grison.jtoml.antlr.TomlParser.IntegerContext;
import me.grison.jtoml.antlr.TomlParser.ListContext;
import me.grison.jtoml.antlr.TomlParser.SectionContext;
import me.grison.jtoml.antlr.TomlParser.StringContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AntlrToml extends HashMap<String, Object> implements Toml {

    private Map<String, Object> context;

    public AntlrToml() {
        super();
        context = new HashMap<String, Object>();
    }

    @Override
    public Object get(String key) {
        Object value = context.get(key);
        return value;
    }

    @Override
    public String getString(String key) {
        String value = (String) get(key);
        if (value == null) {
            value = "";
        }
        value = value.replaceAll("\\\\n", "\n");
        return value;
    }

    @Override
    public Integer getInt(String key) {
        return (Integer) get(key);
    }

    @Override
    public Float getFloat(String key) {
        return Float.parseFloat(getString(key));
    }

    @Override
    public Calendar getDate(String key) {
        return (Calendar) get(key);
    }

    @Override
    public List<Object> getList(String key) {
        return (List<Object>) get(key);
    }

    @Override
    public Boolean getBoolean(String key) {
        return (Boolean) get(key);
    }

    @Override
    public Toml parseString(String content) {
        InputStream stringInputStream = new ByteArrayInputStream(
                content.getBytes());
        parseInputStream(stringInputStream);
        return this;
    }

    @Override
    public Toml parseFile(File file) throws FileNotFoundException {
        InputStream fileInputStream = new FileInputStream(file);
        parseInputStream(fileInputStream);
        return this;
    }

    private void parseInputStream(InputStream fileInputStream) {
        try {
            ANTLRInputStream in = new ANTLRInputStream(fileInputStream);
            TomlLexer lexer = new TomlLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TomlParser parser = new TomlParser(tokens);
            ParseTree tree = parser.toml();
            System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new TomlLoader(context), tree);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    class TomlLoader extends TomlBaseListener {
        private final Map<String, Object> tomlContext;
        private String section = "";

        public TomlLoader(Map<String, Object> context) {
            this.tomlContext = context;
        }

        private void put(String key, Object value) {
            String sectionKey = prependSection(key);
            tomlContext.put(sectionKey, value);
        }

        private String prependSection(String key) {
            return ("".equals(section) ? "" : section + ".") + key;
        }

        @Override
        public void enterSection(SectionContext ctx) {
            this.section = unquote(ctx.getText());
        }

        @Override
        public void enterString(StringContext ctx) {
            String key = ctx.WORD().getText();
            String value = unquote(ctx.STRING().getText());
            put(key, value);
        }

        @Override
        public void enterDate(DateContext ctx) {
            String key = ctx.WORD().getText();
            Calendar value = parseDate(ctx.DATE().getText());
            put(key, value);
        }

        @Override
        public void enterInteger(IntegerContext ctx) {
            String key = ctx.WORD().getText();
            Integer value = Integer.valueOf(ctx.INT().getText());
            put(key, value);
        }

        @Override
        public void enterBoolean(BooleanContext ctx) {
            String key = ctx.WORD().getText();
            Boolean value = Boolean.valueOf(ctx.BOOLEAN().getText());
            put(key, value);
        }

        @Override
        public void enterList(ListContext ctx) {
            String key = ctx.WORD().getText();
            String value = ctx.array().getText().trim();
            // remove []
            value = unquote(value);
            List<Object> arr = parseArray(value);
            put(key, arr);
        }

        private List<Object> parseArray(String value) {
            List<Object> arr = new ArrayList<Object>();
            StringTokenizer tokenizer = new StringTokenizer(value, ",");
            while(tokenizer.hasMoreTokens()) {
                String element = tokenizer.nextToken().trim();
                if(element.startsWith("\"")) {
                    // string
                    arr.add(element);
                } else if(element.startsWith("[")) {
                    // TODO how to parse a nested array?
                } else if(element.matches("\\d+")) {
                    Integer valueOf = Integer.valueOf(element);
                    arr.add(valueOf);
                } else {
                    System.err.println("array element could not be parsed: " + element);
                }
            }
            return arr;
        }

        private String unquote(String string) {
            if (string.startsWith("[") || string.startsWith("\"")) {
                string = string.substring(1);
            }
            if (string.endsWith("]") || string.endsWith("\"")) {
                string = string.substring(0, string.length() - 1);
            }
            return string.trim();
        }

        private Calendar parseDate(String date) {
            // 1979-05-27T07:32:00Z
            final SimpleDateFormat TOML_DATEFORMAT = new SimpleDateFormat(
                    "yyyy-MM-dd'T'hh:mm:SS'Z'");
            TOML_DATEFORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
            Calendar calendar = Calendar.getInstance(TimeZone
                    .getTimeZone("UTC"));
            try {
                Date value = TOML_DATEFORMAT.parse(date);
                calendar.setTime(value);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return calendar;
        }
    }
}
