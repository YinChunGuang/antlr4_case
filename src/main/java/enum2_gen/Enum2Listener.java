// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Enum2.g4 by ANTLR 4.8
package enum2_gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Enum2Parser}.
 */
public interface Enum2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Enum2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Enum2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Enum2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Enum2Parser.ExprContext ctx);
}