import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import enum2_gen.{Enum2Lexer, Enum2Parser}
import listener.CSVLoader
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}


object Enum2Main {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("enum2.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new Enum2Lexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new Enum2Parser(tokenStream)

        val tree = parser.stat()


    }






}
