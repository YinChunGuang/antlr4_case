import java.nio.file.Paths

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.MyPropertyFileVisitor
import propertyfile_gen.{PropertyFileLexer, PropertyFileParser}


object PropertyFileMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("propertyfile.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new PropertyFileLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new PropertyFileParser(tokenStream)

        val visitor = new MyPropertyFileVisitor

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
