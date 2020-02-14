package visitor

import expr_gen.{ExprBaseVisitor, ExprParser}

class MyExprVisitor extends ExprBaseVisitor[Int]{


  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitExpr_NewLine(ctx: ExprParser.Expr_NewLineContext): Int = {

    val res =  visit(ctx.expr())
    println(s"res is $res")
    res
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitAssignment(ctx: ExprParser.AssignmentContext): Int = {
    super.visitAssignment(ctx)

    val id = ctx.ID().getText
    val value = visit(ctx.expr())

    println(s"$id = $value")

    value
  }


  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitId(ctx: ExprParser.IdContext): Int = 0

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitADD_Sub(ctx: ExprParser.ADD_SubContext): Int = {

    val first = visit(ctx.expr(0))
    val second = visit(ctx.expr(1))

    val op = ctx.ADD_Sub.getText

    if (op == "+") first + second
    else first - second


  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitInt(ctx: ExprParser.IntContext): Int = {
    ctx.INT().getText.toInt
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitMult_Div(ctx: ExprParser.Mult_DivContext): Int = {

    val first = visit(ctx.expr(0))
    val second = visit(ctx.expr(1))

    val op = ctx.Mult_Div.getText

    if (op == "*") first * second
    else first / second
  }
}
