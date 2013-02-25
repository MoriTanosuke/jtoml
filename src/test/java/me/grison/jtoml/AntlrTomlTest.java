package me.grison.jtoml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import me.grison.jtoml.antlr.TomlLexer;
import me.grison.jtoml.antlr.TomlParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;


public class AntlrTomlTest {

    @Test
    public void test() throws FileNotFoundException, IOException {
        ANTLRInputStream in = new ANTLRInputStream(new FileInputStream("src/test/resources/example.toml"));
        TomlLexer lexer = new TomlLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TomlParser parser = new TomlParser(tokens);
        ParseTree tree = parser.toml();
        System.out.println(tree.toStringTree(parser));
    }

}
