// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Keywords.g4 by ANTLR 4.8

package keywords_gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KeywordsParser}.
 */
public interface KeywordsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KeywordsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(KeywordsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KeywordsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(KeywordsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KeywordsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KeywordsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KeywordsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KeywordsParser.ExprContext ctx);
}