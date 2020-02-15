import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import listener.CSVLoader
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.MyCSVVisitor


object CSVMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("csv.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new CSVLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new CSVParser(tokenStream)

//        val visitor = new MyCSVVisitor

//        val newtree = visitor.visit(parser.file())

        val csvLoader = new CSVLoader

        val treeWalker = new ParseTreeWalker

        treeWalker.walk(csvLoader, parser.file())

        println(s"value is ${csvLoader.rows.foreach{
            row => row.iterator.foreach(println(_))
            println()
        }}")


    }






}
