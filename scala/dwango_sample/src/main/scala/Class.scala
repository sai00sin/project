object Class {
  def main(args: Array[String]) :Unit = {



  	class APrinter() {
  		def print(): Unit = {
  			println("A")
  		}
  	}

  	class BPrinter() extends APrinter {
  		override def print(): Unit = {
  			println("B")
  		}
  	}

  	val a = new APrinter()
  	val b = new BPrinter()

  	println(a.print)
  	println(b.print)

  }
}