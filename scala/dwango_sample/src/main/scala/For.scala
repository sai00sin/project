object For {
  def main(args: Array[String]) :Unit = {

    for(x <- 1 to 5; y <- 1 until 5) {
      println("x = " + x + " y = " + y)
    }


  }
}