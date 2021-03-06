import java.nio.file.Paths

import fuzzyjava_gen.{FuzzyJavaLexer, FuzzyJavaParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}



object FuzzyJavaMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("C.java").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new FuzzyJavaLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new FuzzyJavaParser(tokenStream)

        parser.altfile()

//        val visitor = new MyCSVVisitor
//
//        val newtree = visitor.visit(parser.file())

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
