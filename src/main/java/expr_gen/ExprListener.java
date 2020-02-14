// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Expr.g4 by ANTLR 4.8
package expr_gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_NewLine(ExprParser.Expr_NewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_NewLine(ExprParser.Expr_NewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(ExprParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(ExprParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParent(ExprParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParent(ExprParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD_Sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD_Sub(ExprParser.ADD_SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD_Sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD_Sub(ExprParser.ADD_SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult_Div}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_Div(ExprParser.Mult_DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult_Div}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_Div(ExprParser.Mult_DivContext ctx);
}