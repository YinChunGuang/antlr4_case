package listener

import java.awt.Color

import javax.swing.{JDialog, JLabel, WindowConstants}
import org.antlr.v4.runtime.{BaseErrorListener, Parser, RecognitionException, Recognizer}
import scala.collection.JavaConverters._

class DialogListener extends BaseErrorListener {
  override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit ={

    val stack = recognizer.asInstanceOf[Parser].getRuleInvocationStack()
    val stack_reverse = stack.asScala.toArray.reverse
    val str = s"rule stack: $stack_reverse" +
      s"line $line: $charPositionInLine at $offendingSymbol: --- $msg"
    val dialog = new JDialog()
    val contentPane = dialog.getContentPane
    contentPane.add(new JLabel(str))
    contentPane.setBackground(Color.white)
    dialog.setTitle("Synatax error")
    dialog.pack()
    dialog.setLocationRelativeTo(null)
    dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
    dialog.setVisible(true)

  }
}
