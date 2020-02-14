import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.MyCSVVisitor


object CSVMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("csv.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new CSVLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new CSVParser(tokenStream)

        val visitor = new MyCSVVisitor

        val newtree = visitor.visit(parser.file())

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
