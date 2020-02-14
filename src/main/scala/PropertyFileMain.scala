import java.nio.file.Paths

import listener.MyPropertyFileListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.MyPropertyFileVisitor
import propertyfile_gen.{PropertyFileLexer, PropertyFileParser}


object PropertyFileMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("propertyfile.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new PropertyFileLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new PropertyFileParser(tokenStream)

        val visitor = new MyPropertyFileVisitor

        val tree = parser.file()
        val newtree = visitor.visit(tree)

        println(s"visitor running")
        visitor.properties.foreach(println)

        val listener = new MyPropertyFileListener

        val walker = new ParseTreeWalker

        walker.walk(listener, tree)

        println(s"listener running...")
        listener.properties.foreach(println)



    }






}
