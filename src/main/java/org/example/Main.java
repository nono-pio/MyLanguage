package org.example;


import antlr.GrammarLexer;
import antlr.GrammarParser;
import compiler.CompilerTree;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("src/main/resources/myGrammar.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);

        MyGrammarVisitor visitor = new MyGrammarVisitor();
        CompilerTree compiler = visitor.visit(parser.program());
        System.out.println(compiler);

    }
}