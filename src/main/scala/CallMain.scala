import java.nio.file.Paths

import call_gen.{CallLexer, CallParser}
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, DiagnosticErrorListener}
import strategy.MyErrorStrategy


object CallMain {

  def main(args: Array[String]): Unit = {
    val demo_uri = getClass.getClassLoader.getResource("call.txt").toURI

    val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

    val lexer = new CallLexer(inputstream)

    val tokenStream = new CommonTokenStream(lexer)

    val parser = new CallParser(tokenStream)

    parser.setErrorHandler(new MyErrorStrategy)

//    parser.getInterpreter.setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION)

//    parser.removeErrorListeners() // 移除ConsoleErrorListner
//
//    parser.addErrorListener(new DiagnosticErrorListener())

    val tree = parser.stat()

  }


}
