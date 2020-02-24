// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4/errors\Call.g4 by ANTLR 4.8

package call_gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CallParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CallVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CallParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CallParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(CallParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CallParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CallParser.ExprContext ctx);
}