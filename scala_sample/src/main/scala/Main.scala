object Main {
  def main(args: Array[String]) :Unit = {
  	val inc = (x: Int) => x +1
  	println(((x:Int) => {
  x * x
}:Int)(2))
    // λ(x).(x*x)
  }
}