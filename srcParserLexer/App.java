
// import ANTLR's runtime libraries
import java.util.Scanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class App {

    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiny lisp 2022. Authors: De la cruz G., Castul G., Cituk M.");
        System.out.println("Made in java with <3, coffee & pizza.");
        System.out.println("Insert your tlisp expression or 'exit()' to close the tlisp prompt.");

        System.out.print("(tlisp) > ");
        String iString = sc.nextLine();
        while (!iString.equals("exit()")) {
            lispLexerParserEvaluator(iString);
            System.out.print("(tlisp) > ");
            iString = sc.nextLine();
        }
        sc.close();
    }

    void lispLexerParserEvaluator(String iString) {

        // create a CharStream that reads from a String
        CharStream input = CharStreams.fromString(iString);
        // create a lexer that feeds off of input CharStream
        arithLispLexer lexer = new arithLispLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        arithLispParser parser = new arithLispParser(tokens);
        ParseTree tree = null;

        try {
            tree = parser.exprS(); // begin parsing at exprS rule+

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("That' not a valid expression.");
            return;
        }

        // System.out.println("Expression tree: " + tree.toStringTree(parser)); // print
        // LISP-style tree
        System.out.println("Expression tree: " + tree.toStringTree(parser));
        System.out.println("Val: " + (new TLispPrefixEvaluator()).evaluate(iString));
    }

    public static void main(String[] args) throws Exception {
        new App().init();
    }
}