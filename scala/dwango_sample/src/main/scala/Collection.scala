object Collection {
  def main(args: Array[String]) :Unit = {


    def printAll(chars: List[String]): Unit = {
      chars match {
        case head :: Nil => println(head)
        case head :: tail => {
          println(head)
          printAll(tail)
        }
        case _ =>
      }
    }
    printAll(List("H","e","l","l","o"))


  }
}