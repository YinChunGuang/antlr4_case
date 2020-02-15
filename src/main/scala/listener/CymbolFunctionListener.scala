package listener

import cymbol_gen.CymbolBaseListener

import collection.mutable
import scala.collection.mutable.ArrayBuffer

class CymbolFunctionListener extends CymbolBaseListener {

  // nodes,代表着节点的结合, edges代表着边的集合
  case class Graph(nodes: mutable.SortedSet[String]=mutable.SortedSet.empty,
                   edges: mutable.MultiDict[String, String]=mutable.MultiDict.empty) {

    def edge(source: String, target: String): Unit = edges += source -> target

    def toDot: String = {

      val buf = ArrayBuffer.empty[String]

      buf += "digraph G {\n"
      buf += "  ranksep=0.25;\n"
      buf += "  edge [arrowsize=0.5];\n"
      buf += "  node [shape=circle, fontname=\"ArialNarrow\",\n"
      buf += "        fontsize=12, fixedsize=true, height=0.45];\n"
      buf += "    \n"

      // 首先打印所有的节点
//      nodes.foreach{node =>
//        buf += node
//        buf += "; "
//      }
      buf += nodes.mkString("  ", "; ", "\n")

      for ((src, trgs) <- edges.sets) {
        trgs.foreach{trg =>
          buf += "  "
          buf += src
          buf += " -> "
          buf += trg
          buf += "\n"
        }
      }

      buf += "}\n"


      buf.mkString("")
    }
  }

  val graph = Graph()

  var currentFunctionName: String = null

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def enterFunctionDecl(ctx: _root_.cymbol_gen.CymbolParser.FunctionDeclContext): Unit = {
    // 当进入到这个函数的树形结构的时候,我们就开始对其进行记录的操作
    currentFunctionName = ctx.ID().getText
    graph.nodes += currentFunctionName

  }

  /**
   * {@inheritDoc }
   *
   * <p>The default implementation does nothing.</p>
   */
  override def exitCall(ctx: _root_.cymbol_gen.CymbolParser.CallContext): Unit = {

    // 将当前函数映射到被调用函数上
    val functionName = ctx.ID().getText
    graph.edge(currentFunctionName, functionName)
  }
}
