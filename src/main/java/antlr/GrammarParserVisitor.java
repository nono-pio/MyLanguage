// Generated from C:/Users/nolan/IdeaProjects/untitled/src/main/java/org/example\GrammarParser.g4 by ANTLR 4.12.0
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link GrammarParser#program}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(GrammarParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#block}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(GrammarParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#line}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLine(GrammarParser.LineContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#one_line}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOne_line(GrammarParser.One_lineContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#keyword}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitKeyword(GrammarParser.KeywordContext ctx);

    /**
     * Visit a parse tree produced by the {@code int}
     * labeled alternative in {@link GrammarParser#primary}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt(GrammarParser.IntContext ctx);

    /**
     * Visit a parse tree produced by the {@code float}
     * labeled alternative in {@link GrammarParser#primary}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloat(GrammarParser.FloatContext ctx);

    /**
     * Visit a parse tree produced by the {@code char}
     * labeled alternative in {@link GrammarParser#primary}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitChar(GrammarParser.CharContext ctx);

    /**
     * Visit a parse tree produced by the {@code string}
     * labeled alternative in {@link GrammarParser#primary}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(GrammarParser.StringContext ctx);

    /**
     * Visit a parse tree produced by the {@code boolean}
     * labeled alternative in {@link GrammarParser#primary}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBoolean(GrammarParser.BooleanContext ctx);

    /**
     * Visit a parse tree produced by the {@code bitwiseExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitwiseExpr(GrammarParser.BitwiseExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryExpr(GrammarParser.UnaryExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code addSubExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddSubExpr(GrammarParser.AddSubExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code primaryExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryExpr(GrammarParser.PrimaryExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code orExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrExpr(GrammarParser.OrExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code multDivExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultDivExpr(GrammarParser.MultDivExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code callExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCallExpr(GrammarParser.CallExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code idExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdExpr(GrammarParser.IdExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code andExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAndExpr(GrammarParser.AndExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code cmpExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCmpExpr(GrammarParser.CmpExprContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#if}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf(GrammarParser.IfContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#switch}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSwitch(GrammarParser.SwitchContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#case}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCase(GrammarParser.CaseContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#default}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefault(GrammarParser.DefaultContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#definition}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefinition(GrammarParser.DefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#call}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall(GrammarParser.CallContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#return}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturn(GrammarParser.ReturnContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#var_ass}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_ass(GrammarParser.Var_assContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#var_assOp}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_assOp(GrammarParser.Var_assOpContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#var_inc_dec}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_inc_dec(GrammarParser.Var_inc_decContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#while}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhile(GrammarParser.WhileContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#do}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDo(GrammarParser.DoContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#for}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor(GrammarParser.ForContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#foreach}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForeach(GrammarParser.ForeachContext ctx);
}