import java.nio.file.Paths

import keywords_gen.{KeywordsLexer, KeywordsParser}
import listener.CSVLoader
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}


object KeyWordsMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("keywords.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new KeywordsLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new KeywordsParser(tokenStream)

        val tree = parser.stat()


    }






}
