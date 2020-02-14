package visitor

import propertyfile_gen.PropertyFileBaseVisitor

class MyPropertyFileVisitor extends PropertyFileBaseVisitor[Any] {
  val properties = collection.mutable.Map.empty[String, String]
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitProp(ctx: _root_.propertyfile_gen.PropertyFileParser.PropContext): Any = {
    val key = ctx.ID().getText
    val value = ctx.STRING().getText

    properties += key -> value
    super.visitProp(ctx)
  }
}
