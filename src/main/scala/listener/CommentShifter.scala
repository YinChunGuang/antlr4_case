package listener

import cymbol_gen.{CymbolBaseListener, CymbolLexer}
import org.antlr.v4.runtime.{CommonTokenStream, Token, TokenStreamRewriter}

import scala.collection.JavaConverters._

/*
  在创建一个绑定到词法符号流上的TokenStreamRewriter位于Cymbol词法分析和语法分析器之间
 */
class CommentShifter(val tokens: CommonTokenStream)
  extends CymbolBaseListener{

  val rewriter = new TokenStreamRewriter(tokens)
  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitVarDecl(ctx: _root_.cymbol_gen.CymbolParser.VarDeclContext): Unit = {

    val semiToken = ctx.getStop

    val i = semiToken.getTokenIndex

    val cmtChannel = try {
      tokens.getHiddenTokensToRight(i, CymbolLexer.COMMENTS).asScala.toList
    } catch  {
      case _: Exception => List.empty[Token]
    }

    cmtChannel.headOption.foreach{ cmtToken =>
      val txt = cmtToken.getText.substring(2)
      val newCmt = s"/* ${txt.trim} */\n"
      rewriter.insertBefore(ctx.start, newCmt)
      rewriter.replace(cmtToken, "\n")
    }


  }
}
