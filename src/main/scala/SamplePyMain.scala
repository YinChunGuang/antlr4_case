import java.nio.file.Paths

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import samplepy_gen.{SamplePyLexer, SamplePyParser}

object SamplePyMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("simplepy.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new SamplePyLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new SamplePyParser(tokenStream)

        val tree = parser.file()

        println(s"tree is ${tree}")




    }






}
