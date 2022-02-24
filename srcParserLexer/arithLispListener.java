// Generated from ./arithLisp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithLispParser}.
 */
public interface arithLispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arithLispParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(arithLispParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(arithLispParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#tlisp}.
	 * @param ctx the parse tree
	 */
	void enterTlisp(arithLispParser.TlispContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#tlisp}.
	 * @param ctx the parse tree
	 */
	void exitTlisp(arithLispParser.TlispContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#exprS}.
	 * @param ctx the parse tree
	 */
	void enterExprS(arithLispParser.ExprSContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#exprS}.
	 * @param ctx the parse tree
	 */
	void exitExprS(arithLispParser.ExprSContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#list_f}.
	 * @param ctx the parse tree
	 */
	void enterList_f(arithLispParser.List_fContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#list_f}.
	 * @param ctx the parse tree
	 */
	void exitList_f(arithLispParser.List_fContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(arithLispParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(arithLispParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(arithLispParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(arithLispParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#neg}.
	 * @param ctx the parse tree
	 */
	void enterNeg(arithLispParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#neg}.
	 * @param ctx the parse tree
	 */
	void exitNeg(arithLispParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(arithLispParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(arithLispParser.PosContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithLispParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(arithLispParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithLispParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(arithLispParser.EmptyContext ctx);
}