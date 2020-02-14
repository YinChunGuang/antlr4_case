package visitor

import gen.ScalaBaseVisitor

class MyScalaVisitor extends ScalaBaseVisitor[Any] {
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitCompilationUnit(ctx: _root_.gen.ScalaParser.CompilationUnitContext): Any = {
    println(s"visitCompilationUnit...")
    super.visitCompilationUnit(ctx)}
}



