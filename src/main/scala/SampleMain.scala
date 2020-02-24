import java.nio.file.Paths

import listener.{DialogListener, UnderlineListener, VerboseListener}
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{BaseErrorListener, CharStreams, CommonTokenStream, Parser, RecognitionException, Recognizer}
import simple_gen.{SimpleLexer, SimpleParser}




object SampleMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("simple.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new SimpleLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new SimpleParser(tokenStream)

        parser.removeErrorListeners()

//        parser.addErrorListener(new VerboseListener)
//        parser.addErrorListener(new DialogListener)
        parser.addErrorListener(new UnderlineListener)

        val tree = parser.prog()





//        println(s"value is ${csvLoader.rows.foreach{
//            row => row.iterator.foreach(println(_))
//            println()
//        }}")


    }






}
