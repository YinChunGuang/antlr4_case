import java.nio.file.Paths

import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream, DiagnosticErrorListener, ParserRuleContext}
import vec_gen.{VecLexer, VecParser}

import scala.collection.JavaConverters._

object VecMain {

  def main(args: Array[String]): Unit = {
    val demo_uri = getClass.getClassLoader.getResource("vec.txt").toURI

    val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

    val lexer = new VecLexer(inputstream)

    val tokenStream = new CommonTokenStream(lexer)

    val parser = new VecParser(tokenStream)

    val tree = parser.vec4(4)

    println(tree.children.asScala(1).asInstanceOf[ParserRuleContext].children.asScala)

  }


}
