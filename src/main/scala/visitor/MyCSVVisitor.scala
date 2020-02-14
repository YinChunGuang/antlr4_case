package visitor

import csv_gen.CSVBaseVisitor
import  scala.collection.JavaConverters._

import scala.language.experimental

class MyCSVVisitor extends CSVBaseVisitor[Any] {
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitHdr(ctx: csv_gen.CSVParser.HdrContext): Any = {
    println(s"visit Hdr...")

    val fieldnodes = ctx.row().children

    fieldnodes.asScala.zipWithIndex
      .collect{case (node, index) if index % 2 == 0 => node}
      .foreach(node => println(node.getText))

    super.visitHdr(ctx)
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  override def visitFile(ctx: _root_.csv_gen.CSVParser.FileContext): Any = {

    println(s"总共有${ctx.children.size() - 1}条记录")

    super.visitFile(ctx)}
}
