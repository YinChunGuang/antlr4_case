package listener.errors

import org.antlr.v4.runtime._

class UnderlineListener extends BaseErrorListener {
  override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {

    System.err.println(s"line $line: $charPositionInLine $msg")
    System.err.println("begin")

    underlineError(recognizer, offendingSymbol.asInstanceOf[Token], line, charPositionInLine)
  }

  def underlineError(recognizer: Recognizer[_, _], offendingToken: Token, line: Int, charPositionInline: Int): Unit = {
    val tokens = recognizer.getInputStream.asInstanceOf[CommonTokenStream]
    val input = tokens.getTokenSource.getInputStream.toString
    val lines = input.split("\n")
    val errorLine = lines(line - 1)
    println("---------------------")
    System.err.println(errorLine)
    (0 to charPositionInline).foreach(_ => System.err.print(" "))
    val start = offendingToken.getStartIndex
    val stop = offendingToken.getStopIndex
    if (start >= 0 && stop >= 0)
      (start to stop).foreach(_ => System.err.print("^"))

    System.err.println()
  }
}
