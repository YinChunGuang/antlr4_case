// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Enum2.g4 by ANTLR 4.8
package enum2_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Enum2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Enum2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Enum2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Enum2Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Enum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Enum2Parser.ExprContext ctx);
}