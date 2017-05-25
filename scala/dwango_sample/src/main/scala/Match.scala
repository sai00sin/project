object Match {
  def main(args: Array[String]) :Unit = {




  	val obj: Any = List("a")
  	obj match {
  		case v: List[_] => println("List[_]")
  	}




  }
}