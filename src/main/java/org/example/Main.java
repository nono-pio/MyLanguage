package org.example;


import antlr.GrammarLexer;
import antlr.GrammarParser;
import compiler.CompilerTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        startTimer();

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName("src/main/resources/myGrammar.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);

        MyGrammarVisitor visitor = new MyGrammarVisitor();
        CompilerTree compiler = visitor.visit(parser.program());

        endTimer();
        System.out.println(compiler);

    }

    public static long startTimeNano = 0;
    public static void startTimer() {
        startTimeNano = System.nanoTime();
    }

    public static void endTimer() {
        long endTimeNano = System.nanoTime();
        long totalTime = endTimeNano - startTimeNano;

        System.out.printf("The time was %.2e ns / %.2fms / %.4fs%n", (double) totalTime, totalTime / 10e6d, totalTime / 10e9d);
    }

}