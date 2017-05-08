object Main {
  def main(args: Array[String]) :Unit = {




/*
 	λa.(λx.a)は

  	println(((a: Int) => (x: Int) => a)(5)(2))
*/

/*
	λ(x, y).f(y, x)は

	def f(x: Int, y: Int) = {
		x + 3 * y
	}

	println(((x: Int, y: Int) => f(y, x))(2, 5))
*/

  }
}