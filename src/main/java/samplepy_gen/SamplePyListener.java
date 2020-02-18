// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\SamplePy.g4 by ANTLR 4.8
package samplepy_gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SamplePyParser}.
 */
public interface SamplePyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SamplePyParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SamplePyParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SamplePyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SamplePyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SamplePyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SamplePyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SamplePyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SamplePyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SamplePyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SamplePyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SamplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SamplePyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SamplePyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SamplePyParser.ListContext ctx);
}