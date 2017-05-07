/**
  * Created by inouesaishin on 2017/05/07.
  */
class InnerNode(name: String) extends Node(name: String) {
  var children = List[Node]()
  def addChild(node: Node) = children ::= node
  override def callRecursively = {
    super.callRecursively
    children.foreach(_.callRecursively)
  }
}
