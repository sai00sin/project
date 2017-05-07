/**
  * Created by inouesaishin on 2017/05/07.
  */
class LeafNode(name: String) extends Node(name: String) {
  def addChild(node: Node) = throw new RuntimeException("葉ノードに子ノードは追加できまへん")
}
