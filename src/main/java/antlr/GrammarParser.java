// Generated from C:/Users/nolan/IdeaProjects/untitled/src/main/java/org/example\GrammarParser.g4 by ANTLR 4.12.0
package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
    public static final int
            COMMENT = 1, LINE_COMMENT = 2, WS = 3, VAR = 4, IF = 5, ELSE = 6, FOR = 7, FOREACH = 8,
            WHILE = 9, DO = 10, BREAK = 11, CONTINUE = 12, SWITCH = 13, CASE = 14, DEFAULT = 15,
            THROW = 16, CATCH = 17, DEF = 18, RETURN = 19, ASSIGN = 20, ADD_ASSIGN = 21, SUB_ASSIGN = 22,
            MUL_ASSIGN = 23, DIV_ASSIGN = 24, AND_ASSIGN = 25, OR_ASSIGN = 26, XOR_ASSIGN = 27,
            MOD_ASSIGN = 28, LSHIFT_ASSIGN = 29, RSHIFT_ASSIGN = 30, GT = 31, LT = 32, NOT = 33,
            EQUAL = 34, LE = 35, GE = 36, NOTEQUAL = 37, AND = 38, OR = 39, INC = 40, DEC = 41, ADD = 42,
            SUB = 43, MUL = 44, DIV = 45, MOD = 46, BIT_NOT = 47, BIT_AND = 48, BIT_OR = 49, BIT_XOR = 50,
            BIT_SHIFTL = 51, BIT_SHIFTR = 52, OPEN = 53, CLOSE = 54, OPEN_BRACKET = 55, CLOSE_BRACKET = 56,
            OPEN_SQUARE = 57, CLOSE_SQUARE = 58, COLON = 59, SEMI = 60, COMMA = 61, DOT = 62,
            BOOLEAN = 63, STRING = 64, CHAR = 65, FLOAT = 66, INT = 67, ID = 68;
    public static final int
            RULE_program = 0, RULE_block = 1, RULE_line = 2, RULE_one_line = 3, RULE_keyword = 4,
            RULE_primary = 5, RULE_expr = 6, RULE_if = 7, RULE_switch = 8, RULE_case = 9,
            RULE_default = 10, RULE_definition = 11, RULE_call = 12, RULE_return = 13,
            RULE_var_ass = 14, RULE_var_assOp = 15, RULE_var_inc_dec = 16, RULE_while = 17,
            RULE_do = 18, RULE_for = 19, RULE_foreach = 20;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001D\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000" +
                    ",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001" +
                    "3\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0003\u0007~\b\u0007\u0003\u0007\u0080\b\u0007\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0089\b\b\n\b\f\b\u008c\t\b" +
                    "\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
                    "\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0005\u000b\u009f\b\u000b\n\u000b\f\u000b\u00a2\t\u000b" +
                    "\u0003\u000b\u00a4\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f" +
                    "\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ae\b\f\n\f\f\f\u00b1\t\f\u0003" +
                    "\f\u00b3\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001\u000e" +
                    "\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012" +
                    "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0013\u0003\u0013\u00dc\b\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014" +
                    "\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001\f\u0015\u0000" +
                    "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c" +
                    "\u001e \"$&(\u0000\b\u0001\u0000\u000b\f\u0003\u0000!!*+//\u0001\u0000" +
                    ",.\u0001\u0000*+\u0001\u000004\u0002\u0000\u001f \"%\u0001\u0000\u0015" +
                    "\u001e\u0001\u0000()\u00f8\u0000-\u0001\u0000\u0000\u0000\u00020\u0001" +
                    "\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000" +
                    "\u0000\bM\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\f\\\u0001" +
                    "\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000" +
                    "\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000" +
                    "\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000" +
                    "\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000" +
                    "\u0000\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000" +
                    "\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00cc\u0001\u0000\u0000\u0000" +
                    "&\u00d3\u0001\u0000\u0000\u0000(\u00e0\u0001\u0000\u0000\u0000*,\u0003" +
                    "\u0004\u0002\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000" +
                    "-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0001\u0001\u0000" +
                    "\u0000\u0000/-\u0001\u0000\u0000\u000004\u00057\u0000\u000013\u0003\u0004" +
                    "\u0002\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001" +
                    "\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000" +
                    "64\u0001\u0000\u0000\u000078\u00058\u0000\u00008\u0003\u0001\u0000\u0000" +
                    "\u00009B\u0003\u0006\u0003\u0000:B\u0003\u000e\u0007\u0000;B\u0003\u0010" +
                    "\b\u0000<B\u0003\u0016\u000b\u0000=B\u0003\"\u0011\u0000>B\u0003$\u0012" +
                    "\u0000?B\u0003&\u0013\u0000@B\u0003(\u0014\u0000A9\u0001\u0000\u0000\u0000" +
                    "A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000" +
                    "\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000" +
                    "\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000" +
                    "CJ\u0003\f\u0006\u0000DJ\u0003\b\u0004\u0000EJ\u0003\u001a\r\u0000FJ\u0003" +
                    "\u001c\u000e\u0000GJ\u0003 \u0010\u0000HJ\u0003\u001e\u000f\u0000IC\u0001" +
                    "\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000" +
                    "IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000" +
                    "\u0000JK\u0001\u0000\u0000\u0000KL\u0005<\u0000\u0000L\u0007\u0001\u0000" +
                    "\u0000\u0000MN\u0007\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OU\u0005" +
                    "C\u0000\u0000PU\u0005B\u0000\u0000QU\u0005A\u0000\u0000RU\u0005@\u0000" +
                    "\u0000SU\u0005?\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000" +
                    "\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000" +
                    "\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0006\u0006\uffff\uffff" +
                    "\u0000W]\u0003\n\u0005\u0000X]\u0005D\u0000\u0000Y]\u0003\u0018\f\u0000" +
                    "Z[\u0007\u0001\u0000\u0000[]\u0003\f\u0006\u0007\\V\u0001\u0000\u0000" +
                    "\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001" +
                    "\u0000\u0000\u0000]r\u0001\u0000\u0000\u0000^_\n\u0006\u0000\u0000_`\u0007" +
                    "\u0002\u0000\u0000`q\u0003\f\u0006\u0007ab\n\u0005\u0000\u0000bc\u0007" +
                    "\u0003\u0000\u0000cq\u0003\f\u0006\u0006de\n\u0004\u0000\u0000ef\u0007" +
                    "\u0004\u0000\u0000fq\u0003\f\u0006\u0005gh\n\u0003\u0000\u0000hi\u0005" +
                    "&\u0000\u0000iq\u0003\f\u0006\u0004jk\n\u0002\u0000\u0000kl\u0005\'\u0000" +
                    "\u0000lq\u0003\f\u0006\u0003mn\n\u0001\u0000\u0000no\u0007\u0005\u0000" +
                    "\u0000oq\u0003\f\u0006\u0002p^\u0001\u0000\u0000\u0000pa\u0001\u0000\u0000" +
                    "\u0000pd\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001\u0000" +
                    "\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001" +
                    "\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000" +
                    "tr\u0001\u0000\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u00055\u0000\u0000" +
                    "wx\u0003\f\u0006\u0000xy\u00056\u0000\u0000y\u007f\u0003\u0002\u0001\u0000" +
                    "z}\u0005\u0006\u0000\u0000{~\u0003\u000e\u0007\u0000|~\u0003\u0002\u0001" +
                    "\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0080\u0001" +
                    "\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000" +
                    "\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\r\u0000" +
                    "\u0000\u0082\u0083\u00055\u0000\u0000\u0083\u0084\u0003\f\u0006\u0000" +
                    "\u0084\u0085\u00056\u0000\u0000\u0085\u008a\u00057\u0000\u0000\u0086\u0089" +
                    "\u0003\u0012\t\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u0086\u0001" +
                    "\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001" +
                    "\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001" +
                    "\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001" +
                    "\u0000\u0000\u0000\u008d\u008e\u00058\u0000\u0000\u008e\u0011\u0001\u0000" +
                    "\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u00055\u0000" +
                    "\u0000\u0091\u0092\u0003\f\u0006\u0000\u0092\u0093\u00056\u0000\u0000" +
                    "\u0093\u0094\u0003\u0002\u0001\u0000\u0094\u0013\u0001\u0000\u0000\u0000" +
                    "\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000" +
                    "\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0012\u0000\u0000" +
                    "\u0099\u009a\u0005D\u0000\u0000\u009a\u00a3\u00055\u0000\u0000\u009b\u00a0" +
                    "\u0005D\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d\u009f\u0005D" +
                    "\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000" +
                    "\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000" +
                    "\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000" +
                    "\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000" +
                    "\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u00056\u0000" +
                    "\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u0017\u0001\u0000\u0000" +
                    "\u0000\u00a8\u00a9\u0005D\u0000\u0000\u00a9\u00b2\u00055\u0000\u0000\u00aa" +
                    "\u00af\u0003\f\u0006\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac\u00ae" +
                    "\u0003\f\u0006\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001" +
                    "\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001" +
                    "\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001" +
                    "\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005" +
                    "6\u0000\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005\u0013" +
                    "\u0000\u0000\u00b7\u00b9\u0003\f\u0006\u0000\u00b8\u00b7\u0001\u0000\u0000" +
                    "\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001b\u0001\u0000\u0000" +
                    "\u0000\u00ba\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bc\u0005D\u0000\u0000" +
                    "\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd\u00be\u0003\f\u0006\u0000\u00be" +
                    "\u001d\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005D\u0000\u0000\u00c0\u00c1" +
                    "\u0007\u0006\u0000\u0000\u00c1\u00c2\u0003\f\u0006\u0000\u00c2\u001f\u0001" +
                    "\u0000\u0000\u0000\u00c3\u00c4\u0005D\u0000\u0000\u00c4\u00c5\u0007\u0007" +
                    "\u0000\u0000\u00c5!\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\t\u0000" +
                    "\u0000\u00c7\u00c8\u00055\u0000\u0000\u00c8\u00c9\u0003\f\u0006\u0000" +
                    "\u00c9\u00ca\u00056\u0000\u0000\u00ca\u00cb\u0003\u0002\u0001\u0000\u00cb" +
                    "#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00ce" +
                    "\u0003\u0002\u0001\u0000\u00ce\u00cf\u0005\t\u0000\u0000\u00cf\u00d0\u0005" +
                    "5\u0000\u0000\u00d0\u00d1\u0003\f\u0006\u0000\u00d1\u00d2\u00056\u0000" +
                    "\u0000\u00d2%\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000" +
                    "\u00d4\u00d5\u00055\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6" +
                    "\u00d7\u0005=\u0000\u0000\u00d7\u00d8\u0003\f\u0006\u0000\u00d8\u00db" +
                    "\u0005=\u0000\u0000\u00d9\u00dc\u0003\u001e\u000f\u0000\u00da\u00dc\u0003" +
                    " \u0010\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000" +
                    "\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u00056\u0000" +
                    "\u0000\u00de\u00df\u0003\u0002\u0001\u0000\u00df\'\u0001\u0000\u0000\u0000" +
                    "\u00e0\u00e1\u0005\b\u0000\u0000\u00e1\u00e2\u00055\u0000\u0000\u00e2" +
                    "\u00e3\u0005D\u0000\u0000\u00e3\u00e4\u0005;\u0000\u0000\u00e4\u00e5\u0003" +
                    "\f\u0006\u0000\u00e5\u00e6\u00056\u0000\u0000\u00e6\u00e7\u0003\u0002" +
                    "\u0001\u0000\u00e7)\u0001\u0000\u0000\u0000\u0012-4AIT\\pr}\u007f\u0088" +
                    "\u008a\u00a0\u00a3\u00af\u00b2\u00b8\u00db";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public GrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "block", "line", "one_line", "keyword", "primary", "expr",
                "if", "switch", "case", "default", "definition", "call", "return", "var_ass",
                "var_assOp", "var_inc_dec", "while", "do", "for", "foreach"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, "'var'", "'if'", "'else'", "'for'", "'foreach'",
                "'while'", "'do'", "'break'", "'continue'", "'switch'", "'case'", "'default'",
                "'throw'", "'catch'", "'def'", "'return'", "'='", "'+='", "'-='", "'*='",
                "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>'", "'<'",
                "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'",
                "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'^'", "'<<'",
                "'>>'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','",
                "'.'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "COMMENT", "LINE_COMMENT", "WS", "VAR", "IF", "ELSE", "FOR", "FOREACH",
                "WHILE", "DO", "BREAK", "CONTINUE", "SWITCH", "CASE", "DEFAULT", "THROW",
                "CATCH", "DEF", "RETURN", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN",
                "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN",
                "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "GT", "LT", "NOT", "EQUAL", "LE", "GE",
                "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD",
                "BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_SHIFTL", "BIT_SHIFTR",
                "OPEN", "CLOSE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE", "CLOSE_SQUARE",
                "COLON", "SEMI", "COMMA", "DOT", "BOOLEAN", "STRING", "CHAR", "FLOAT",
                "INT", "ID"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "GrammarParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223218096636149840L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
                    {
                        {
                            setState(42);
                            line();
                        }
                    }
                    setState(47);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(48);
                match(OPEN_BRACKET);
                setState(52);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223218096636149840L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
                    {
                        {
                            setState(49);
                            line();
                        }
                    }
                    setState(54);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(55);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LineContext line() throws RecognitionException {
        LineContext _localctx = new LineContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_line);
        try {
            setState(65);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case VAR:
                case BREAK:
                case CONTINUE:
                case RETURN:
                case NOT:
                case ADD:
                case SUB:
                case BIT_NOT:
                case BOOLEAN:
                case STRING:
                case CHAR:
                case FLOAT:
                case INT:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(57);
                    one_line();
                }
                break;
                case IF:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(58);
                    if_();
                }
                break;
                case SWITCH:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(59);
                    switch_();
                }
                break;
                case DEF:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(60);
                    definition();
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(61);
                    while_();
                }
                break;
                case DO:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(62);
                    do_();
                }
                break;
                case FOR:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(63);
                    for_();
                }
                break;
                case FOREACH:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(64);
                    foreach();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final One_lineContext one_line() throws RecognitionException {
        One_lineContext _localctx = new One_lineContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_one_line);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(67);
                        expr(0);
                    }
                    break;
                    case 2: {
                        setState(68);
                        keyword();
                    }
                    break;
                    case 3: {
                        setState(69);
                        return_();
                    }
                    break;
                    case 4: {
                        setState(70);
                        var_ass();
                    }
                    break;
                    case 5: {
                        setState(71);
                        var_inc_dec();
                    }
                    break;
                    case 6: {
                        setState(72);
                        var_assOp();
                    }
                    break;
                }
                setState(75);
                match(SEMI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final KeywordContext keyword() throws RecognitionException {
        KeywordContext _localctx = new KeywordContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_keyword);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                _la = _input.LA(1);
                if (!(_la == BREAK || _la == CONTINUE)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrimaryContext primary() throws RecognitionException {
        PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_primary);
        try {
            setState(84);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INT:
                    _localctx = new IntContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(79);
                    match(INT);
                }
                break;
                case FLOAT:
                    _localctx = new FloatContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(80);
                    match(FLOAT);
                }
                break;
                case CHAR:
                    _localctx = new CharContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(81);
                    match(CHAR);
                }
                break;
                case STRING:
                    _localctx = new StringContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(82);
                    match(STRING);
                }
                break;
                case BOOLEAN:
                    _localctx = new BooleanContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(83);
                    match(BOOLEAN);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 12;
        enterRecursionRule(_localctx, 12, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        _localctx = new PrimaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(87);
                        primary();
                    }
                    break;
                    case 2: {
                        _localctx = new IdExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(88);
                        match(ID);
                    }
                    break;
                    case 3: {
                        _localctx = new CallExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(89);
                        call();
                    }
                    break;
                    case 4: {
                        _localctx = new UnaryExprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(90);
                        ((UnaryExprContext) _localctx).unary = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 153940217823232L) != 0))) {
                            ((UnaryExprContext) _localctx).unary = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(91);
                        expr(7);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(114);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(112);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                                case 1: {
                                    _localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(94);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(95);
                                    ((MultDivExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0))) {
                                        ((MultDivExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(96);
                                    expr(7);
                                }
                                break;
                                case 2: {
                                    _localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(97);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(98);
                                    ((AddSubExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((AddSubExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(99);
                                    expr(6);
                                }
                                break;
                                case 3: {
                                    _localctx = new BitwiseExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(100);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(101);
                                    ((BitwiseExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724278030336L) != 0))) {
                                        ((BitwiseExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(102);
                                    expr(5);
                                }
                                break;
                                case 4: {
                                    _localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(103);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(104);
                                    ((AndExprContext) _localctx).op = match(AND);
                                    setState(105);
                                    expr(4);
                                }
                                break;
                                case 5: {
                                    _localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(106);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(107);
                                    ((OrExprContext) _localctx).op = match(OR);
                                    setState(108);
                                    expr(3);
                                }
                                break;
                                case 6: {
                                    _localctx = new CmpExprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(109);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(110);
                                    ((CmpExprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 264140488704L) != 0))) {
                                        ((CmpExprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(111);
                                    expr(2);
                                }
                                break;
                            }
                        }
                    }
                    setState(116);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final IfContext if_() throws RecognitionException {
        IfContext _localctx = new IfContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_if);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(IF);
                setState(118);
                match(OPEN);
                setState(119);
                expr(0);
                setState(120);
                match(CLOSE);
                setState(121);
                block();
                setState(127);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(122);
                        match(ELSE);
                        setState(125);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case IF: {
                                setState(123);
                                if_();
                            }
                            break;
                            case OPEN_BRACKET: {
                                setState(124);
                                block();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SwitchContext switch_() throws RecognitionException {
        SwitchContext _localctx = new SwitchContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_switch);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(129);
                match(SWITCH);
                setState(130);
                match(OPEN);
                setState(131);
                expr(0);
                setState(132);
                match(CLOSE);
                setState(133);
                match(OPEN_BRACKET);
                setState(138);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CASE || _la == DEFAULT) {
                    {
                        setState(136);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case CASE: {
                                setState(134);
                                case_();
                            }
                            break;
                            case DEFAULT: {
                                setState(135);
                                default_();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(140);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(141);
                match(CLOSE_BRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CaseContext case_() throws RecognitionException {
        CaseContext _localctx = new CaseContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_case);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(143);
                match(CASE);
                setState(144);
                match(OPEN);
                setState(145);
                expr(0);
                setState(146);
                match(CLOSE);
                setState(147);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DefaultContext default_() throws RecognitionException {
        DefaultContext _localctx = new DefaultContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_default);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(149);
                match(DEFAULT);
                setState(150);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DefinitionContext definition() throws RecognitionException {
        DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(152);
                match(DEF);
                setState(153);
                match(ID);
                setState(154);
                match(OPEN);
                setState(163);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(155);
                        match(ID);
                        setState(160);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(156);
                                    match(COMMA);
                                    setState(157);
                                    match(ID);
                                }
                            }
                            setState(162);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(165);
                match(CLOSE);
                setState(166);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CallContext call() throws RecognitionException {
        CallContext _localctx = new CallContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_call);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(168);
                match(ID);
                setState(169);
                match(OPEN);
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 67645752833L) != 0)) {
                    {
                        setState(170);
                        expr(0);
                        setState(175);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(171);
                                    match(COMMA);
                                    setState(172);
                                    expr(0);
                                }
                            }
                            setState(177);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(180);
                match(CLOSE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ReturnContext return_() throws RecognitionException {
        ReturnContext _localctx = new ReturnContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_return);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(182);
                match(RETURN);
                setState(184);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 67645752833L) != 0)) {
                    {
                        setState(183);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_assContext var_ass() throws RecognitionException {
        Var_assContext _localctx = new Var_assContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_var_ass);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                match(VAR);
                setState(187);
                match(ID);
                setState(188);
                match(ASSIGN);
                setState(189);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_assOpContext var_assOp() throws RecognitionException {
        Var_assOpContext _localctx = new Var_assOpContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_var_assOp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                match(ID);
                setState(192);
                ((Var_assOpContext) _localctx).op = _input.LT(1);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 2145386496L) != 0))) {
                    ((Var_assOpContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(193);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_inc_decContext var_inc_dec() throws RecognitionException {
        Var_inc_decContext _localctx = new Var_inc_decContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_var_inc_dec);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                match(ID);
                setState(196);
                ((Var_inc_decContext) _localctx).inc_dec = _input.LT(1);
                _la = _input.LA(1);
                if (!(_la == INC || _la == DEC)) {
                    ((Var_inc_decContext) _localctx).inc_dec = (Token) _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileContext while_() throws RecognitionException {
        WhileContext _localctx = new WhileContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_while);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(WHILE);
                setState(199);
                match(OPEN);
                setState(200);
                expr(0);
                setState(201);
                match(CLOSE);
                setState(202);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DoContext do_() throws RecognitionException {
        DoContext _localctx = new DoContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_do);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(204);
                match(DO);
                setState(205);
                block();
                setState(206);
                match(WHILE);
                setState(207);
                match(OPEN);
                setState(208);
                expr(0);
                setState(209);
                match(CLOSE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForContext for_() throws RecognitionException {
        ForContext _localctx = new ForContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_for);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(FOR);
                setState(212);
                match(OPEN);
                setState(213);
                var_ass();
                setState(214);
                match(COMMA);
                setState(215);
                expr(0);
                setState(216);
                match(COMMA);
                setState(219);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                    case 1: {
                        setState(217);
                        var_assOp();
                    }
                    break;
                    case 2: {
                        setState(218);
                        var_inc_dec();
                    }
                    break;
                }
                setState(221);
                match(CLOSE);
                setState(222);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ForeachContext foreach() throws RecognitionException {
        ForeachContext _localctx = new ForeachContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_foreach);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                match(FOREACH);
                setState(225);
                match(OPEN);
                setState(226);
                match(ID);
                setState(227);
                match(COLON);
                setState(228);
                expr(0);
                setState(229);
                match(CLOSE);
                setState(230);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 6:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 6);
            case 1:
                return precpred(_ctx, 5);
            case 2:
                return precpred(_ctx, 4);
            case 3:
                return precpred(_ctx, 3);
            case 4:
                return precpred(_ctx, 2);
            case 5:
                return precpred(_ctx, 1);
        }
        return true;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<LineContext> line() {
            return getRuleContexts(LineContext.class);
        }

        public LineContext line(int i) {
            return getRuleContext(LineContext.class, i);
        }

        @Override public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(GrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(GrammarParser.CLOSE_BRACKET, 0);
        }

        public List<LineContext> line() {
            return getRuleContexts(LineContext.class);
        }

        public LineContext line(int i) {
            return getRuleContext(LineContext.class, i);
        }

        @Override public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LineContext extends ParserRuleContext {
        public LineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public One_lineContext one_line() {
            return getRuleContext(One_lineContext.class, 0);
        }

        public IfContext if_() {
            return getRuleContext(IfContext.class, 0);
        }

        public SwitchContext switch_() {
            return getRuleContext(SwitchContext.class, 0);
        }

        public DefinitionContext definition() {
            return getRuleContext(DefinitionContext.class, 0);
        }

        public WhileContext while_() {
            return getRuleContext(WhileContext.class, 0);
        }

        public DoContext do_() {
            return getRuleContext(DoContext.class, 0);
        }

        public ForContext for_() {
            return getRuleContext(ForContext.class, 0);
        }

        public ForeachContext foreach() {
            return getRuleContext(ForeachContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitLine(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitLine(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class One_lineContext extends ParserRuleContext {
        public One_lineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SEMI() {
            return getToken(GrammarParser.SEMI, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public KeywordContext keyword() {
            return getRuleContext(KeywordContext.class, 0);
        }

        public ReturnContext return_() {
            return getRuleContext(ReturnContext.class, 0);
        }

        public Var_assContext var_ass() {
            return getRuleContext(Var_assContext.class, 0);
        }

        public Var_inc_decContext var_inc_dec() {
            return getRuleContext(Var_inc_decContext.class, 0);
        }

        public Var_assOpContext var_assOp() {
            return getRuleContext(Var_assOpContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_one_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterOne_line(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitOne_line(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitOne_line(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class KeywordContext extends ParserRuleContext {
        public KeywordContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode BREAK() {
            return getToken(GrammarParser.BREAK, 0);
        }

        public TerminalNode CONTINUE() {
            return getToken(GrammarParser.CONTINUE, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_keyword;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterKeyword(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitKeyword(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitKeyword(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrimaryContext extends ParserRuleContext {
        public PrimaryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PrimaryContext() {
        }

        @Override public int getRuleIndex() {
            return RULE_primary;
        }

        public void copyFrom(PrimaryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BooleanContext extends PrimaryContext {
        public BooleanContext(PrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode BOOLEAN() {
            return getToken(GrammarParser.BOOLEAN, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterBoolean(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitBoolean(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitBoolean(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StringContext extends PrimaryContext {
        public StringContext(PrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode STRING() {
            return getToken(GrammarParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitString(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CharContext extends PrimaryContext {
        public CharContext(PrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CHAR() {
            return getToken(GrammarParser.CHAR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterChar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitChar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitChar(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FloatContext extends PrimaryContext {
        public FloatContext(PrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode FLOAT() {
            return getToken(GrammarParser.FLOAT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterFloat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitFloat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitFloat(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IntContext extends PrimaryContext {
        public IntContext(PrimaryContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INT() {
            return getToken(GrammarParser.INT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterInt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitInt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitInt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext() {
        }

        @Override public int getRuleIndex() {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BitwiseExprContext extends ExprContext {
        public Token op;

        public BitwiseExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode BIT_SHIFTL() {
            return getToken(GrammarParser.BIT_SHIFTL, 0);
        }

        public TerminalNode BIT_SHIFTR() {
            return getToken(GrammarParser.BIT_SHIFTR, 0);
        }

        public TerminalNode BIT_AND() {
            return getToken(GrammarParser.BIT_AND, 0);
        }

        public TerminalNode BIT_XOR() {
            return getToken(GrammarParser.BIT_XOR, 0);
        }

        public TerminalNode BIT_OR() {
            return getToken(GrammarParser.BIT_OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterBitwiseExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitBitwiseExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitBitwiseExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UnaryExprContext extends ExprContext {
        public Token unary;

        public UnaryExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(GrammarParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(GrammarParser.SUB, 0);
        }

        public TerminalNode BIT_NOT() {
            return getToken(GrammarParser.BIT_NOT, 0);
        }

        public TerminalNode NOT() {
            return getToken(GrammarParser.NOT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterUnaryExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitUnaryExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitUnaryExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AddSubExprContext extends ExprContext {
        public Token op;

        public AddSubExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode ADD() {
            return getToken(GrammarParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(GrammarParser.SUB, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterAddSubExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitAddSubExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitAddSubExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrimaryExprContext extends ExprContext {
        public PrimaryExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterPrimaryExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitPrimaryExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitPrimaryExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OrExprContext extends ExprContext {
        public Token op;

        public OrExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(GrammarParser.OR, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterOrExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitOrExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitOrExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MultDivExprContext extends ExprContext {
        public Token op;

        public MultDivExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(GrammarParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(GrammarParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(GrammarParser.MOD, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterMultDivExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitMultDivExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitMultDivExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CallExprContext extends ExprContext {
        public CallExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public CallContext call() {
            return getRuleContext(CallContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterCallExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitCallExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitCallExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdExprContext extends ExprContext {
        public IdExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterIdExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitIdExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitIdExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AndExprContext extends ExprContext {
        public Token op;

        public AndExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(GrammarParser.AND, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterAndExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitAndExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitAndExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CmpExprContext extends ExprContext {
        public Token op;

        public CmpExprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode EQUAL() {
            return getToken(GrammarParser.EQUAL, 0);
        }

        public TerminalNode NOTEQUAL() {
            return getToken(GrammarParser.NOTEQUAL, 0);
        }

        public TerminalNode LE() {
            return getToken(GrammarParser.LE, 0);
        }

        public TerminalNode GE() {
            return getToken(GrammarParser.GE, 0);
        }

        public TerminalNode GT() {
            return getToken(GrammarParser.GT, 0);
        }

        public TerminalNode LT() {
            return getToken(GrammarParser.LT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterCmpExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitCmpExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitCmpExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IfContext extends ParserRuleContext {
        public IfContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(GrammarParser.IF, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(GrammarParser.ELSE, 0);
        }

        public IfContext if_() {
            return getRuleContext(IfContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_if;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterIf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitIf(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitIf(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SwitchContext extends ParserRuleContext {
        public SwitchContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode SWITCH() {
            return getToken(GrammarParser.SWITCH, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public TerminalNode OPEN_BRACKET() {
            return getToken(GrammarParser.OPEN_BRACKET, 0);
        }

        public TerminalNode CLOSE_BRACKET() {
            return getToken(GrammarParser.CLOSE_BRACKET, 0);
        }

        public List<CaseContext> case_() {
            return getRuleContexts(CaseContext.class);
        }

        public CaseContext case_(int i) {
            return getRuleContext(CaseContext.class, i);
        }

        public List<DefaultContext> default_() {
            return getRuleContexts(DefaultContext.class);
        }

        public DefaultContext default_(int i) {
            return getRuleContext(DefaultContext.class, i);
        }

        @Override public int getRuleIndex() {
            return RULE_switch;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterSwitch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitSwitch(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitSwitch(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CaseContext extends ParserRuleContext {
        public CaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CASE() {
            return getToken(GrammarParser.CASE, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_case;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterCase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitCase(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitCase(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefaultContext extends ParserRuleContext {
        public DefaultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DEFAULT() {
            return getToken(GrammarParser.DEFAULT, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_default;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterDefault(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitDefault(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitDefault(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefinitionContext extends ParserRuleContext {
        public DefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DEF() {
            return getToken(GrammarParser.DEF, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(GrammarParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(GrammarParser.ID, i);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GrammarParser.COMMA, i);
        }

        @Override public int getRuleIndex() {
            return RULE_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CallContext extends ParserRuleContext {
        public CallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GrammarParser.COMMA, i);
        }

        @Override public int getRuleIndex() {
            return RULE_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitCall(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ReturnContext extends ParserRuleContext {
        public ReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode RETURN() {
            return getToken(GrammarParser.RETURN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_return;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterReturn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitReturn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_assContext extends ParserRuleContext {
        public Var_assContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode VAR() {
            return getToken(GrammarParser.VAR, 0);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(GrammarParser.ASSIGN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_var_ass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterVar_ass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitVar_ass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitVar_ass(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_assOpContext extends ParserRuleContext {
        public Token op;

        public Var_assOpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ADD_ASSIGN() {
            return getToken(GrammarParser.ADD_ASSIGN, 0);
        }

        public TerminalNode SUB_ASSIGN() {
            return getToken(GrammarParser.SUB_ASSIGN, 0);
        }

        public TerminalNode MUL_ASSIGN() {
            return getToken(GrammarParser.MUL_ASSIGN, 0);
        }

        public TerminalNode DIV_ASSIGN() {
            return getToken(GrammarParser.DIV_ASSIGN, 0);
        }

        public TerminalNode AND_ASSIGN() {
            return getToken(GrammarParser.AND_ASSIGN, 0);
        }

        public TerminalNode OR_ASSIGN() {
            return getToken(GrammarParser.OR_ASSIGN, 0);
        }

        public TerminalNode XOR_ASSIGN() {
            return getToken(GrammarParser.XOR_ASSIGN, 0);
        }

        public TerminalNode RSHIFT_ASSIGN() {
            return getToken(GrammarParser.RSHIFT_ASSIGN, 0);
        }

        public TerminalNode LSHIFT_ASSIGN() {
            return getToken(GrammarParser.LSHIFT_ASSIGN, 0);
        }

        public TerminalNode MOD_ASSIGN() {
            return getToken(GrammarParser.MOD_ASSIGN, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_var_assOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterVar_assOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitVar_assOp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitVar_assOp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_inc_decContext extends ParserRuleContext {
        public Token inc_dec;

        public Var_inc_decContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        public TerminalNode INC() {
            return getToken(GrammarParser.INC, 0);
        }

        public TerminalNode DEC() {
            return getToken(GrammarParser.DEC, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_var_inc_dec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterVar_inc_dec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitVar_inc_dec(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitVar_inc_dec(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WhileContext extends ParserRuleContext {
        public WhileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHILE() {
            return getToken(GrammarParser.WHILE, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_while;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterWhile(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitWhile(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitWhile(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DoContext extends ParserRuleContext {
        public DoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DO() {
            return getToken(GrammarParser.DO, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode WHILE() {
            return getToken(GrammarParser.WHILE, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_do;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterDo(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitDo(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitDo(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ForContext extends ParserRuleContext {
        public ForContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FOR() {
            return getToken(GrammarParser.FOR, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public Var_assContext var_ass() {
            return getRuleContext(Var_assContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GrammarParser.COMMA, i);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public Var_assOpContext var_assOp() {
            return getRuleContext(Var_assOpContext.class, 0);
        }

        public Var_inc_decContext var_inc_dec() {
            return getRuleContext(Var_inc_decContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_for;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterFor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitFor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitFor(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ForeachContext extends ParserRuleContext {
        public ForeachContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FOREACH() {
            return getToken(GrammarParser.FOREACH, 0);
        }

        public TerminalNode OPEN() {
            return getToken(GrammarParser.OPEN, 0);
        }

        public TerminalNode ID() {
            return getToken(GrammarParser.ID, 0);
        }

        public TerminalNode COLON() {
            return getToken(GrammarParser.COLON, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode CLOSE() {
            return getToken(GrammarParser.CLOSE, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_foreach;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).enterForeach(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarParserListener) ((GrammarParserListener) listener).exitForeach(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarParserVisitor)
                return ((GrammarParserVisitor<? extends T>) visitor).visitForeach(this);
            else return visitor.visitChildren(this);
        }
    }
}