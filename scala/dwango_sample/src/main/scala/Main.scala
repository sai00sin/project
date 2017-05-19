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

/*
	def f(x: Int, y: Int) = {
		x + 3 * y
	}

	def g(x: Int) = {
		x * x
	}

	def h(x: Int) = {
		x * x
	}

	println(((x: Int, y: Int) => g(f(x, y)))(3, 9))
*/

/*
def fact(n: Int): Int = {
  n match {
    case 0 => 1
    case n if n > 0 => n * fact(n - 1)
  }
}
println(fact(5))
println(fact(0))	
*/

	val a = 1
	val b: Int => Int = x => x + 1

	println(b(a))

  }
}

/*
β変換の具体例
1.まず、先頭の'λx.'は取り去って、ラムダ式（関数定義）本体を取り出します。
2.その本体内に出現する変数xをすべて（0箇所かもしれないし、100箇所かもしれない）、引数の式で置き換えます。
3.もちろん、変数の名前は'x'じゃなくてもいいです。
4.λ(x, y).(…x…y…) のようなときは、変数xだけじゃなくて変数yも対応する式で置き換えます。
*/

/*
参考サイト
http://d.hatena.ne.jp/m-hiyama/20070208/1170905900

http://qiita.com/shigemk2/items/3a5e5df9fe85cf0b4eb2
*/