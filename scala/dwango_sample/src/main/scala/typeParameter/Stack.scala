abstract class Stack[+A] {
	def push[E >: A](element: E): Stack[E]
	def top: A
	def pop: Stack[A]
	def isEmpty: Boolean
}