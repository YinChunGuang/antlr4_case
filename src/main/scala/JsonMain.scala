import java.nio.file.Paths

import json_gen.{JsonLexer, JsonParser}
import listener.XMLEmitter
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import visitor.MyJsonVisitor


object JsonMain {

    def main(args: Array[String]): Unit = {
        val demo_uri = getClass.getClassLoader.getResource("json.txt").toURI

        val inputstream = CharStreams.fromPath(Paths.get(demo_uri))

        val lexer = new JsonLexer(inputstream)

        val tokenStream = new CommonTokenStream(lexer)

        val parser = new JsonParser(tokenStream)

        val tree = parser.json()

        val visitor = new MyJsonVisitor

        val newtree = visitor.visit(tree)

        val xmlEmiter = new XMLEmitter

        val parseTreeWalker = new ParseTreeWalker

        parseTreeWalker.walk(xmlEmiter, tree)







    }






}
