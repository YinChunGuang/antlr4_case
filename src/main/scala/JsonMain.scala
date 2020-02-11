import java.nio.file.Paths

import json_gen.{JsonLexer, JsonParser}
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.MyJsonVisitor


object JsonMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("json.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new JsonLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new JsonParser(tokenStream)

        val visitor = new MyJsonVisitor

        val newtree = visitor.visit(parser.json())

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
