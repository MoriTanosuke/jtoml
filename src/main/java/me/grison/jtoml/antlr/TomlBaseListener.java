// Generated from src/main/resources/Toml.g4 by ANTLR 4.0
package me.grison.jtoml.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class TomlBaseListener implements TomlListener {
	@Override public void enterLiteral_expr(TomlParser.Literal_exprContext ctx) { }
	@Override public void exitLiteral_expr(TomlParser.Literal_exprContext ctx) { }

	@Override public void enterToml_stat(TomlParser.Toml_statContext ctx) { }
	@Override public void exitToml_stat(TomlParser.Toml_statContext ctx) { }

	@Override public void enterDate(TomlParser.DateContext ctx) { }
	@Override public void exitDate(TomlParser.DateContext ctx) { }

	@Override public void enterString(TomlParser.StringContext ctx) { }
	@Override public void exitString(TomlParser.StringContext ctx) { }

	@Override public void enterToml(TomlParser.TomlContext ctx) { }
	@Override public void exitToml(TomlParser.TomlContext ctx) { }

	@Override public void enterList(TomlParser.ListContext ctx) { }
	@Override public void exitList(TomlParser.ListContext ctx) { }

	@Override public void enterBoolean(TomlParser.BooleanContext ctx) { }
	@Override public void exitBoolean(TomlParser.BooleanContext ctx) { }

	@Override public void enterInteger(TomlParser.IntegerContext ctx) { }
	@Override public void exitInteger(TomlParser.IntegerContext ctx) { }

	@Override public void enterComment(TomlParser.CommentContext ctx) { }
	@Override public void exitComment(TomlParser.CommentContext ctx) { }

	@Override public void enterSection(TomlParser.SectionContext ctx) { }
	@Override public void exitSection(TomlParser.SectionContext ctx) { }

	@Override public void enterArray(TomlParser.ArrayContext ctx) { }
	@Override public void exitArray(TomlParser.ArrayContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}