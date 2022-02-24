
// import ANTLR's runtime libraries
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String iString = sc.nextLine();
        // create a CharStream that reads from a String
        CharStream input = CharStreams.fromString(iString);
        // create a lexer that feeds off of input CharStream
        arithLispLexer lexer = new arithLispLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        arithLispParser parser = new arithLispParser(tokens);
        ParseTree tree = parser.exprS(); // begin parsing at exprS rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}