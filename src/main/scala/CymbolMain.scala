import java.nio.file.Paths

import cymbol_gen.{CymbolLexer, CymbolParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.{MyCSVVisitor, MyCymbolVisitor}


object CymbolMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("cymbol.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new CymbolLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new CymbolParser(tokenStream)

        val visitor = new MyCymbolVisitor

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
