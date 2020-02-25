// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4/errors\Pred.g4 by ANTLR 4.8

package pred_gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredParser}.
 */
public interface PredListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PredParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PredParser.AssignContext ctx);
}