import java.nio.file.Paths

import cymbol_gen.{CymbolLexer, CymbolParser}
import listener.{CommentShifter, CymbolFunctionListener}
import org.antlr.v4.runtime.tree.ParseTreeWalker
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

        val tree = parser.file()

        val newtree = visitor.visit(tree)

        val parseTreeWalker = new ParseTreeWalker

        val cymbolFunctionListener = new CymbolFunctionListener

        parseTreeWalker.walk(cymbolFunctionListener, tree)

        val r = cymbolFunctionListener.graph.toDot

        println(s"r is \n $r")

        println(s"--------------------------------")

        val commentShifter = new CommentShifter(tokenStream)

        parseTreeWalker.walk(commentShifter, tree)

    print(s"${commentShifter.rewriter.getText()}")


    }






}
