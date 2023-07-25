package org.example;

import antlr.GrammarParser;
import antlr.GrammarParserVisitor;
import compiler.CompilerTree;
import compiler.ILine;
import compiler.LineType;
import compiler.branch.Assigment;
import compiler.branch.Block;
import compiler.branch.Line;
import compiler.branch.Program;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class MyGrammarVisitor extends AbstractParseTreeVisitor<CompilerTree> implements GrammarParserVisitor<CompilerTree> {


    @Override public CompilerTree visitProgram(GrammarParser.ProgramContext ctx) {

        var linesCtx = ctx.line();
        var lines = new Line[linesCtx.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = (Line) visit(linesCtx.get(i));
        }
        return new Program(lines);
    }

    @Override public CompilerTree visitBlock(GrammarParser.BlockContext ctx) {
        var linesCtx = ctx.line();
        var lines = new Line[linesCtx.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = (Line) visit(linesCtx.get(i));
        }
        return new Block(lines);
    }

    @Override public CompilerTree visitLine(GrammarParser.LineContext ctx) {
        return new Line((ILine) visitChildren(ctx));
    }

    @Override public CompilerTree visitOne_line(GrammarParser.One_lineContext ctx) {
        return visitChildren(ctx);
    }

    @Override public CompilerTree visitPrimary(GrammarParser.PrimaryContext ctx) {
        return null;
    }

    @Override public CompilerTree visitBitwiseExpr(GrammarParser.BitwiseExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitUnaryExpr(GrammarParser.UnaryExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitAddSubExpr(GrammarParser.AddSubExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitPrimaryExpr(GrammarParser.PrimaryExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitOrExpr(GrammarParser.OrExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitMultDivExpr(GrammarParser.MultDivExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitCallExpr(GrammarParser.CallExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitIdExpr(GrammarParser.IdExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitAndExpr(GrammarParser.AndExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitCmpExpr(GrammarParser.CmpExprContext ctx) {
        return null;
    }

    @Override public CompilerTree visitIf(GrammarParser.IfContext ctx) {
        return null;
    }

    @Override public CompilerTree visitSwitch(GrammarParser.SwitchContext ctx) {
        return null;
    }

    @Override public CompilerTree visitCase(GrammarParser.CaseContext ctx) {
        return null;
    }

    @Override public CompilerTree visitDefault(GrammarParser.DefaultContext ctx) {
        return null;
    }

    @Override public CompilerTree visitParameters(GrammarParser.ParametersContext ctx) {
        return null;
    }

    @Override public CompilerTree visitDefinition(GrammarParser.DefinitionContext ctx) {
        return null;
    }

    @Override public CompilerTree visitCall_parameters(GrammarParser.Call_parametersContext ctx) {
        return null;
    }

    @Override public CompilerTree visitCall(GrammarParser.CallContext ctx) {
        return null;
    }

    @Override public CompilerTree visitReturn(GrammarParser.ReturnContext ctx) {
        return null;
    }

    @Override public CompilerTree visitVar_ass(GrammarParser.Var_assContext ctx) {
        return null;
    }

    @Override public CompilerTree visitAssOp(GrammarParser.AssOpContext ctx) {
        return null;
    }

    @Override public CompilerTree visitVar_assOp(GrammarParser.Var_assOpContext ctx) {
        return null;
    }

    @Override public CompilerTree visitVar_inc_dec(GrammarParser.Var_inc_decContext ctx) {
        return null;
    }

    @Override public CompilerTree visitWhile(GrammarParser.WhileContext ctx) {
        return null;
    }

    @Override public CompilerTree visitDo(GrammarParser.DoContext ctx) {
        return null;
    }

    @Override public CompilerTree visitFor(GrammarParser.ForContext ctx) {
        return null;
    }

    @Override public CompilerTree visitForeach(GrammarParser.ForeachContext ctx) {
        return null;
    }
}
