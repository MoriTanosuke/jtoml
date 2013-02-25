// Generated from src/main/resources/Toml.g4 by ANTLR 4.0
package me.grison.jtoml.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TomlListener extends ParseTreeListener {
	void enterLiteral_expr(TomlParser.Literal_exprContext ctx);
	void exitLiteral_expr(TomlParser.Literal_exprContext ctx);

	void enterToml_stat(TomlParser.Toml_statContext ctx);
	void exitToml_stat(TomlParser.Toml_statContext ctx);

	void enterDate(TomlParser.DateContext ctx);
	void exitDate(TomlParser.DateContext ctx);

	void enterString(TomlParser.StringContext ctx);
	void exitString(TomlParser.StringContext ctx);

	void enterToml(TomlParser.TomlContext ctx);
	void exitToml(TomlParser.TomlContext ctx);

	void enterList(TomlParser.ListContext ctx);
	void exitList(TomlParser.ListContext ctx);

	void enterBoolean(TomlParser.BooleanContext ctx);
	void exitBoolean(TomlParser.BooleanContext ctx);

	void enterInteger(TomlParser.IntegerContext ctx);
	void exitInteger(TomlParser.IntegerContext ctx);

	void enterComment(TomlParser.CommentContext ctx);
	void exitComment(TomlParser.CommentContext ctx);

	void enterSection(TomlParser.SectionContext ctx);
	void exitSection(TomlParser.SectionContext ctx);

	void enterArray(TomlParser.ArrayContext ctx);
	void exitArray(TomlParser.ArrayContext ctx);
}