package visitor

import json_gen.JsonBaseVisitor

import scala.collection.JavaConverters._

class MyJsonVisitor extends JsonBaseVisitor[Any] {
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitPair(ctx: _root_.json_gen.JsonParser.PairContext): Any = super.visitPair(ctx)
}
