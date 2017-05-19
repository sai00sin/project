object PatternMatchWild {
	def main(args: Array[String]): Unit = {
		val num = 4

		num match {
			case _ => println("number:" + num)
		}
	}
}