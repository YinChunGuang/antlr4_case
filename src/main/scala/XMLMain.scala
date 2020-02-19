import java.nio.file.Paths


import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import xml_gen.{XMLLexer, XMLParser}


object XMLMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("xml.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new XMLLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new XMLParser(tokenStream)




    }






}
