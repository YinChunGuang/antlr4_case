// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\SamplePy.g4 by ANTLR 4.8
package samplepy_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SamplePyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SamplePyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SamplePyParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SamplePyParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SamplePyParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SamplePyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SamplePyParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SamplePyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SamplePyParser.ListContext ctx);
}