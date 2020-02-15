package listener

import csv_gen.{CSVBaseListener, CSVParser}

import scala.collection.mutable.ArrayBuffer

object CSVLoader {
  val EMPTY = ""
}

class CSVLoader extends CSVBaseListener {

  /* 这个列表中的每个元素是一个代表一行数据的Map,该Map是字段名到字段值的映射 */
  val rows = ArrayBuffer.empty[collection.mutable.Map[String, String]]
  /* 列名列表 */
  val header = ArrayBuffer.empty[String]

  /* 构造一个存放在当前的行中的所有字段值的列表 */
  val currentRowFieldValues = ArrayBuffer.empty[String]


  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def enterHdr(ctx: CSVParser.HdrContext): Unit = {
    header.clear()
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitHdr(ctx: CSVParser.HdrContext): Unit = {

    header ++= currentRowFieldValues
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def enterRow(ctx: CSVParser.RowContext): Unit = {

    currentRowFieldValues.clear()
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitRow(ctx: CSVParser.RowContext): Unit = {

    if (ctx.getParent.getRuleIndex == CSVParser.RULE_hdr) return

    val tmp = collection.mutable.Map.empty[String, String]
//    (header zip currentRowFieldValues).foldLeft(tmp){
//      case (newtmp, (key, value)) => newtmp += key -> value
//    }

    for((key, value) <- header zip currentRowFieldValues) {
      tmp += key -> value
    }

    rows += tmp

  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitText(ctx: CSVParser.TextContext): Unit = {
    currentRowFieldValues += ctx.TEXT().getText
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitString(ctx: CSVParser.StringContext): Unit = {
    currentRowFieldValues += ctx.STRING().getText
  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitEmpty(ctx: CSVParser.EmptyContext): Unit = {

    currentRowFieldValues += CSVLoader.EMPTY

  }
}
