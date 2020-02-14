import java.nio.file.Paths

import expr_gen.{ExprLexer, ExprParser}
import listener.MyExprListener
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor. MyExprVisitor


object ExprMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("expr.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new ExprLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new ExprParser(tokenStream)

        val visitor = new MyExprVisitor

        val tree = parser.prog()

        val newtree = visitor.visit(tree)

        val walk = new ParseTreeWalker

        val listener = new MyExprListener

        walk.walk(listener, tree)





    }






}
