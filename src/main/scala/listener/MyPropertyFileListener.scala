package listener

import propertyfile_gen.PropertyFileBaseListener

class MyPropertyFileListener extends PropertyFileBaseListener {

  val properties = collection.mutable.Map.empty[String, String]

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitProp(ctx: _root_.propertyfile_gen.PropertyFileParser.PropContext): Unit = {


    val key = ctx.ID().getText
    val value = ctx.STRING().getText

    properties += key -> value
  }
}
