import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import dot_gen.{DotLexer, DotParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.{MyCSVVisitor, MyDotVisitor}


object DotMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("dot.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new DotLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new DotParser(tokenStream)

        val visitor = new MyDotVisitor

        val newtree = visitor.visit(parser.graph())

        // 接下来则是自己的一些逻辑思考的过程!!!

        // 复合类型与聚合类型

        // enum Color {
        //  case Red, Blue, Green  # 复合类型
        //  }

        // 聚合类型
        // case class (name: String, age: Int, gender: Genders)  聚合类型
        //



    }






}
