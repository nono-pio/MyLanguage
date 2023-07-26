// Generated from C:/Users/nolan/IdeaProjects/untitled/src/main/java/org/example\GrammarParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#one_line}.
	 * @param ctx the parse tree
	 */
	void enterOne_line(GrammarParser.One_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#one_line}.
	 * @param ctx the parse tree
	 */
	void exitOne_line(GrammarParser.One_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterInt(GrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitInt(GrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GrammarParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterChar(GrammarParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitChar(GrammarParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr(GrammarParser.BitwiseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr(GrammarParser.BitwiseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(GrammarParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(GrammarParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(GrammarParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(GrammarParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(GrammarParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(GrammarParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(GrammarParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(GrammarParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(GrammarParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(GrammarParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(GrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(GrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(GrammarParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(GrammarParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(GrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(GrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(GrammarParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(GrammarParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(GrammarParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(GrammarParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(GrammarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(GrammarParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters(GrammarParser.Call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters(GrammarParser.Call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(GrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(GrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_ass}.
	 * @param ctx the parse tree
	 */
	void enterVar_ass(GrammarParser.Var_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_ass}.
	 * @param ctx the parse tree
	 */
	void exitVar_ass(GrammarParser.Var_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assOp}.
	 * @param ctx the parse tree
	 */
	void enterAssOp(GrammarParser.AssOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assOp}.
	 * @param ctx the parse tree
	 */
	void exitAssOp(GrammarParser.AssOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_assOp}.
	 * @param ctx the parse tree
	 */
	void enterVar_assOp(GrammarParser.Var_assOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_assOp}.
	 * @param ctx the parse tree
	 */
	void exitVar_assOp(GrammarParser.Var_assOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_inc_dec(GrammarParser.Var_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_inc_dec(GrammarParser.Var_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(GrammarParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(GrammarParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(GrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(GrammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(GrammarParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(GrammarParser.ForeachContext ctx);
}