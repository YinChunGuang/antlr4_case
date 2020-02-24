package listener.errors

import org.antlr.v4.runtime.{BaseErrorListener, Parser, RecognitionException, Recognizer}

import scala.collection.JavaConverters._

class VerboseListener extends BaseErrorListener {
  override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {

    val stack = recognizer.asInstanceOf[Parser].getRuleInvocationStack
    val reverse_stack = stack.asScala.reverse.toList
    System.err.println(s"rule stack: $reverse_stack")
    System.err.println(s"line $line: $charPositionInLine at $offendingSymbol: $msg")


  }
}