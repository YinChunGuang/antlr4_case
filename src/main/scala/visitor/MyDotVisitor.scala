package visitor

import dot_gen.DotBaseVisitor

class MyDotVisitor extends DotBaseVisitor[Any]{
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitId(ctx: _root_.dot_gen.DotParser.IdContext): Any = {


    super.visitId(ctx)}
}
