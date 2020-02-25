import java.nio.file.Paths

import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, DiagnosticErrorListener}
import pred_gen.{PredLexer, PredParser}


object PredMain {

  def main(args: Array[String]): Unit = {
    val demo_uri = getClass.getClassLoader.getResource("pred.txt").toURI

    val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

    val lexer = new PredLexer(inputstream)

    val tokenStream = new CommonTokenStream(lexer)

    val parser = new PredParser(tokenStream)

    val tree = parser.assign()

  }


}
