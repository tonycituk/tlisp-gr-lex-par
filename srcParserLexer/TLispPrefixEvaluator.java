import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import javax.sql.rowset.CachedRowSet;

/**
 * @author tonycituk
 */
public class TLispPrefixEvaluator {

    /**
     * Stack to store the expression, in case a lisp-function is passed.
     */
    private Stack<String> pilaValores;

    /**
     * Default constructor
     */
    public TLispPrefixEvaluator() {
        this.pilaValores = new Stack<String>();
    }

    /**
     * Parses a tiny lisp prefix expression into a all ws separated tlpe.
     * 
     * @param tLispPrefix tlpe.
     * @return Space separated tlpe.
     * 
     *
     */
    public String parseWithWhiteSpaces(String tLispPrefix) {

        tLispPrefix = tLispPrefix.replaceAll("[(]", "( ").replaceAll("[)]", " )");

        /*
         * System.out.println("This will be evaluated:");
         * String[] tLispPrefixArray = tLispPrefix.split(" ");
         * for (String string : tLispPrefixArray) {
         * System.out.println(string);
         * }
         * System.out.println();
         * System.out.println();
         * System.out.println();
         */
        return tLispPrefix;
    }

    /**
     * Evaluates the passed expression.
     * 
     * @param tLispPrefix Whitespace separated tlpe.
     * @return
     */
    public double evaluate(String tLispPrefix) {
        tLispPrefix = parseWithWhiteSpaces(tLispPrefix);
        String[] tLispPrefixArray = tLispPrefix.split(" ");
        if (tLispPrefixArray[0].equals("(")) {
            Collections.reverse(Arrays.asList(tLispPrefixArray));
            for (String string : tLispPrefixArray) {
                this.pilaValores.push(string);
            }
            return evaluateFunc();
        } else {
            return Double.parseDouble(tLispPrefixArray[0]);
        }
    }

    /**
     * Evaluates the passed tlpe recursively
     * 
     * @param lispList
     * @param start
     * @return
     */
    public double evaluateFunc() {
        double total = 0;
        String firstVal = pilaValores.pop();
        if (firstVal.equals("(")) {
            String operand = pilaValores.pop();
            total = evaluateFunc();
            // String aux = pilaValores.pop();
            // pilaValores.push(aux);
            while (!pilaValores.peek().equals(")")) {
                total =  makeCalculation(operand, total, evaluateFunc());
            }
            // pilaValores.pop();
            return total;
        } else {
            return Double.parseDouble(firstVal);
        }
    }

    private double makeCalculation(String operand, double a, double b) {
        double c = 0;
        switch (operand) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                break;
        }

        return c;
    }

    // Class driver to test its methods
    public static void main(String[] args) {
        // System.out.println(TLispPrefixToRegularPrefix.parseWithComma("(+ 2 (+ 3
        // 4))"));

        System.out.println((new TLispPrefixEvaluator()).evaluate("(+ 25 (* 4 2))"));
    }

}
