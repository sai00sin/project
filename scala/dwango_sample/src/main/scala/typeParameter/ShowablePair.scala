class ShowablePair[A <: Show, B <: Show](val a: A, val b: B) extends Show {
	override def show: String = "(" + a.show + "," + b.show + ")"
}