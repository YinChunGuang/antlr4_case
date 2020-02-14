import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import expr_gen.{ExprLexer, ExprParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.{MyCSVVisitor, MyExprVisitor}


object ExprMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("expr.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new ExprLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new ExprParser(tokenStream)

        val visitor = new MyExprVisitor

        val newtree = visitor.visit(parser.prog())





    }






}
