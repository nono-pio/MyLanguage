package org.example;

import antlr.GrammarParser;
import antlr.GrammarParserVisitor;
import compiler.CompilerTree;
import compiler.Expression;
import compiler.ILine;
import compiler.Operator;
import compiler.branch.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyGrammarVisitor extends AbstractParseTreeVisitor<CompilerTree> implements GrammarParserVisitor<CompilerTree> {


    @Override
    public CompilerTree visitProgram(GrammarParser.ProgramContext ctx) {

        var linesCtx = ctx.line();
        var lines = new Line[linesCtx.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = (Line) visit(linesCtx.get(i));
        }
        return new Program(lines);
    }

    @Override
    public CompilerTree visitBlock(GrammarParser.BlockContext ctx) {
        var linesCtx = ctx.line();
        var lines = new Line[linesCtx.size()];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = (Line) visit(linesCtx.get(i));
        }
        return new Block(lines);
    }

    @Override
    public CompilerTree visitLine(GrammarParser.LineContext ctx) {
        return new Line((ILine) visitChildren(ctx));
    }

    @Override
    public CompilerTree visitOne_line(GrammarParser.One_lineContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public CompilerTree visitInt(GrammarParser.IntContext ctx) {
        return new Integer_(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public CompilerTree visitFloat(GrammarParser.FloatContext ctx) {
        return new Float_(Float.parseFloat(ctx.FLOAT().getText()));
    }

    @Override
    public CompilerTree visitChar(GrammarParser.CharContext ctx) {
        return new Char(ctx.CHAR().getText().charAt(0));
    }

    @Override
    public CompilerTree visitString(GrammarParser.StringContext ctx) {
        String string = ctx.STRING().getText();
        return new String_(string.substring(1, string.length() - 2));
    }

    @Override
    public CompilerTree visitBoolean(GrammarParser.BooleanContext ctx) {
        return new Boolean_(ctx.BOOLEAN().getText().contentEquals("true"));
    }


    @Override
    public CompilerTree visitBitwiseExpr(GrammarParser.BitwiseExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        Operator op = switch (ctx.op.getText()) {
            case "<<" -> Operator.SHIFTL;
            case ">>" -> Operator.SHIFTR;
            case "&" -> Operator.BIT_AND;
            case "^" -> Operator.BIT_XOR;
            case "|" -> Operator.BIT_OR;
            default -> throw new RuntimeException(" Error ");
        };

        return new BinaryExpr(left, right, op);
    }

    @Override
    public CompilerTree visitUnaryExpr(GrammarParser.UnaryExprContext ctx) {
        Expression expr = (Expression) visit(ctx.expr());
        Operator op = switch (ctx.unary.getText()) {
            case "+" -> Operator.POSITIF;
            case "-" -> Operator.NEGATIF;
            case "~" -> Operator.BIT_NOT;
            case "!" -> Operator.NOT;
            default -> throw new RuntimeException(" Error ");
        };

        return new UnaryExpr(expr, op);
    }

    @Override
    public CompilerTree visitAddSubExpr(GrammarParser.AddSubExprContext ctx) {
        return new BinaryExpr((Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1)),
                ctx.op.getText().contentEquals("+") ? Operator.ADD : Operator.SUB);
    }

    @Override
    public CompilerTree visitPrimaryExpr(GrammarParser.PrimaryExprContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public CompilerTree visitOrExpr(GrammarParser.OrExprContext ctx) {
        return new BinaryExpr((Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1)),
                Operator.OR);
    }

    @Override
    public CompilerTree visitMultDivExpr(GrammarParser.MultDivExprContext ctx) {
        return new BinaryExpr((Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1)),
                ctx.op.getText().contentEquals("*") ? Operator.MULT : Operator.DIV);
    }

    @Override
    public CompilerTree visitCallExpr(GrammarParser.CallExprContext ctx) {
        return visitCall(ctx.call());
    }

    @Override
    public CompilerTree visitIdExpr(GrammarParser.IdExprContext ctx) {
        return new Identifier(ctx.ID().getText());
    }

    @Override
    public CompilerTree visitAndExpr(GrammarParser.AndExprContext ctx) {
        return new BinaryExpr((Expression) visit(ctx.expr(0)),
                (Expression) visit(ctx.expr(1)),
                Operator.AND);
    }

    @Override
    public CompilerTree visitCmpExpr(GrammarParser.CmpExprContext ctx) {
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        Operator op = switch (ctx.op.getText()) {
            case "==" -> Operator.EQUAL;
            case "!=" -> Operator.NOTEQUAL;
            case ">" -> Operator.GREATER;
            case "<" -> Operator.SMALLER;
            case ">=" -> Operator.GTEQ;
            case "<=" -> Operator.SMEQ;
            default -> throw new RuntimeException(" Error ");
        };

        return new BinaryExpr(left, right, op);
    }

    @Override
    public CompilerTree visitIf(GrammarParser.IfContext ctx) {
        return null; // TODO: create If plus visit if
    }

    @Override
    public CompilerTree visitSwitch(GrammarParser.SwitchContext ctx) {

        Expression value = (Expression) visit(ctx.expr());
        Case[] cases = new Case[ctx.case_().size()];
        for (int i = 0; i < cases.length; i++) {
            cases[i] = (Case) visitCase(ctx.case_(i));
        }
        Block defaultBlock = (Block) visitDefault(ctx.default_(0));

        return new Switch(value, cases, defaultBlock);
    }

    @Override
    public CompilerTree visitCase(GrammarParser.CaseContext ctx) {
        return new Case((Expression) visit(ctx.expr()), (Block) visitBlock(ctx.block()));
    }

    @Override
    public CompilerTree visitDefault(GrammarParser.DefaultContext ctx) {
        return visitBlock(ctx.block());
    }

    @Override
    public CompilerTree visitParameters(GrammarParser.ParametersContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitDefinition(GrammarParser.DefinitionContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitCall_parameters(GrammarParser.Call_parametersContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitCall(GrammarParser.CallContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitReturn(GrammarParser.ReturnContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitVar_ass(GrammarParser.Var_assContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitAssOp(GrammarParser.AssOpContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitVar_assOp(GrammarParser.Var_assOpContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitVar_inc_dec(GrammarParser.Var_inc_decContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitWhile(GrammarParser.WhileContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitDo(GrammarParser.DoContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitFor(GrammarParser.ForContext ctx) {
        return null;
    }

    @Override
    public CompilerTree visitForeach(GrammarParser.ForeachContext ctx) {
        return null;
    }
}
