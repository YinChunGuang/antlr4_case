package listener

import expr_gen.{ExprBaseListener, ExprParser}

import scala.collection.mutable

class MyExprListener extends ExprBaseListener{

  val stack = mutable.Stack.empty[Int]
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitADD_Sub(ctx: ExprParser.ADD_SubContext): Unit = {

    val second = stack.pop()
    val first = stack.pop()

    val op = ctx.ADD_Sub.getText

    val r = if (op == "+") first + second else first - second

    stack.push(r)

    val f = ctx.expr(0).value
    val s = ctx.expr(1).value
    val r2 = if (op == "+") f + s else f - s
    ctx.value = r2

  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitInt(ctx: ExprParser.IntContext): Unit = {

    stack.push(ctx.INT().getText.toInt)

    ctx.value = ctx.INT().getText.toInt
  }
}
