import java.nio.file.Paths

import csv_gen.{CSVLexer, CSVParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.{MyCSVVisitor, MyRVisitor}
import r_gen.{RLexer, RParser}


object RMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("r.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new RLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new RParser(tokenStream)

        val visitor = new MyRVisitor

        val newtree = visitor.visit(parser.prog())

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
