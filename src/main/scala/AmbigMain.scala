import java.nio.file.Paths

import ambig_gen.{AmbigLexer, AmbigParser}
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, DiagnosticErrorListener}


object AmbigMain {

  def main(args: Array[String]): Unit = {
    val demo_uri = getClass.getClassLoader.getResource("ambig.txt").toURI

    val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

    val lexer = new AmbigLexer(inputstream)

    val tokenStream = new CommonTokenStream(lexer)

    val parser = new AmbigParser(tokenStream)

    parser.getInterpreter.setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION)

    parser.removeErrorListeners() // 移除ConsoleErrorListner

    parser.addErrorListener(new DiagnosticErrorListener())

    val tree = parser.stat()

  }


}
