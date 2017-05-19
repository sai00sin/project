object PatternMatchNoWild {
	def main(args: Array[String]): Unit = {
		val list = List(1, true, "J")

		for(value <- list) {
			value match {
				case num: Integer => println("num:" + num)
				case bool: Boolean => println("bool:" + bool)
			}
		}
	}
}