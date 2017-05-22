import java.util.Locale

object Match {
  def main(args: Array[String]) :Unit = {

  	val obj: AnyRef = "String Literal"

  	obj match {
  		case v:java.lang.Integer =>
  			println("Integer!")
  	}

  }
}