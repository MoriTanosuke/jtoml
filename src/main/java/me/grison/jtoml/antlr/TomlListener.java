// Generated from src/main/resources/Toml.g4 by ANTLR 4.0
package me.grison.jtoml.antlr;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface TomlListener extends ParseTreeListener {
	void enterLiteral_expr(TomlParser.Literal_exprContext ctx);
	void exitLiteral_expr(TomlParser.Literal_exprContext ctx);

	void enterToml_stat(TomlParser.Toml_statContext ctx);
	void exitToml_stat(TomlParser.Toml_statContext ctx);

	void enterValue_expr(TomlParser.Value_exprContext ctx);
	void exitValue_expr(TomlParser.Value_exprContext ctx);

	void enterToml_assignment(TomlParser.Toml_assignmentContext ctx);
	void exitToml_assignment(TomlParser.Toml_assignmentContext ctx);

	void enterToml(TomlParser.TomlContext ctx);
	void exitToml(TomlParser.TomlContext ctx);

	void enterComment(TomlParser.CommentContext ctx);
	void exitComment(TomlParser.CommentContext ctx);

	void enterSection(TomlParser.SectionContext ctx);
	void exitSection(TomlParser.SectionContext ctx);

	void enterArray(TomlParser.ArrayContext ctx);
	void exitArray(TomlParser.ArrayContext ctx);
}