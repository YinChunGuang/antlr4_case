package listener

import json_gen.{JsonBaseListener, JsonParser}
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer


class XMLEmitter extends JsonBaseListener{

  val xml = new ParseTreeProperty[String]

  def getXML(ctx: ParseTree): String = xml.get(ctx)

  def setXML(ctx: ParseTree, s: String): Unit = xml.put(ctx, s)

  def stripQuotes(s: String): String = if (s.length > 0) s.substring(1, s.length - 1) else s

  // 计算的规则就是把树形的结构转化为线性结构来做处理的操作!!!

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitAtom(ctx: _root_.json_gen.JsonParser.AtomContext): Unit = {

    setXML(ctx, ctx.getText)

  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitString(ctx: _root_.json_gen.JsonParser.StringContext): Unit = {
    setXML(ctx, stripQuotes(ctx.getText))
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitArray(ctx: _root_.json_gen.JsonParser.ArrayContext): Unit = {
    val stringBuffer = ArrayBuffer.empty[String]
    stringBuffer += "\n"
    for (value: JsonParser.ValueContext <- ctx.value().asScala) {
      stringBuffer += s"\n<element>${getXML(value)}</element>\n"
    }

    setXML(ctx, stringBuffer.mkString(""))
  }




  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitPair(ctx: _root_.json_gen.JsonParser.PairContext): Unit = {
    val text = stripQuotes(ctx.STRING().getText)

    val r = s"\n<$text>${getXML(ctx.value())}</$text>\n"

    setXML(ctx, r)
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitAnObject(ctx: _root_.json_gen.JsonParser.AnObjectContext): Unit = {
    val stringbuffer = ArrayBuffer.empty[String]
    stringbuffer += "\n"
    for (pair: JsonParser.PairContext <- ctx.pair().asScala) {
      stringbuffer += s"${getXML(pair)}\n"
    }

    setXML(ctx, stringbuffer.mkString(""))
  }


  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitArrayValue(ctx: JsonParser.ArrayValueContext): Unit = {

    if (ctx.children.size() == 0) return

    val text = s"\n${getXML(ctx.array())}\n"

    setXML(ctx, text)

  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitEmptyObject(ctx: JsonParser.EmptyObjectContext): Unit = {
    setXML(ctx, "")
  }


  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitObjectValue(ctx: JsonParser.ObjectValueContext): Unit = {
    if (ctx.children.size() == 0)
      return

    val text = s"\n${getXML(ctx.`object`())}\n"
    setXML(ctx, text)
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitJson(ctx: _root_.json_gen.JsonParser.JsonContext): Unit = {
    println(s"数据从这个方向打印出来的吗?  是的!")
    println(s"\n${getXML(ctx.children.asScala.head)}\n")
  }
}
