// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\IDKeyword.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IDKeywordParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IDKeywordVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IDKeywordParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IDKeywordParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDKeywordParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(IDKeywordParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDKeywordParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IDKeywordParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IDKeywordParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(IDKeywordParser.IdContext ctx);
}