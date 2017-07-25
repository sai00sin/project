/**
  * Created by inouesaishin on 2017/05/07.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val rootNode = new InnerNode("根っこ")
    val InnerNodeA = new InnerNode("内部節A")
    val InnerNodeB = new InnerNode("内部節B")
    val LeafNodeA = new LeafNode("葉A")
    val LeafNodeB = new LeafNode("葉B")

    rootNode.addChild(InnerNodeA)
    rootNode.addChild(InnerNodeB)
    InnerNodeA.addChild(LeafNodeA)
    InnerNodeA.addChild(LeafNodeB)

    rootNode.callRecursively
  }
}
