// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Expr.g4 by ANTLR 4.8
package expr_gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_NewLine(ExprParser.Expr_NewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(ExprParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(ExprParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD_Sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD_Sub(ExprParser.ADD_SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult_Div}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_Div(ExprParser.Mult_DivContext ctx);
}