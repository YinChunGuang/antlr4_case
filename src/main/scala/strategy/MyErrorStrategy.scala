package strategy

import org.antlr.v4.runtime.{DefaultErrorStrategy, NoViableAltException, Parser}

class MyErrorStrategy extends DefaultErrorStrategy {
  override def reportNoViableAlternative(recognizer: Parser, e: NoViableAltException): Unit = {

    // ANTLR 基于语法生成的语法分析器是Parser的子类
    // Parser类继承了Recognizer类
    // 方法参数parser指向检测到错误的语法分析器
    val msg = "cant't choose between alternatives" // 自定义的飞标准消息
    recognizer.notifyErrorListeners(e.getOffendingToken, msg, e)
  }
}
