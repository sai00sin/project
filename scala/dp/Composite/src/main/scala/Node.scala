/**
  * Created by inouesaishin on 2017/05/07.
  */
abstract class Node(name: String) {
  override def toString = name
  def addChild(node: Node): Unit
  def callRecursively = println(toString)
}