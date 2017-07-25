package com.tedneward.calcds1
{
	private[calcds1] abstract class Expr
	private[calcds1] case class Variable(name: String) extends Expr
	private[calcds1] case class Number(value: Double) extends Expr
	private[calcds1] case class UnaryOp(operator : String, arg : Expr) extends Expr
	private[calcds1] case class BinaryOp(operator : String, left : Expr, right : Expr) extends Expr

	object Calc
	{






		def simplify(e : Expr) : Expr =
		{
			e match {
				case UnaryOp("-", UnaryOp("-", x)) => x
				case UnaryOp("+", x) => x
				case BinaryOp("*", x, Number(1)) => x
				case BinaryOp("*", Number(1), x) => x
				case BinaryOp("*", x, Number(0)) => Number(0)
				case BinaryOp("*", Number(0), x) => Number(0)
				case BinaryOp("/", x, Number(1)) => x
				case BinaryOp("+", x, Number(0)) => x
				case BinaryOp("+", Number(0), x) => x
				case _ => e
			}
		}
















		def evaluate(e : Expr) : Double =
		{
			e match {
				case Number(x) => x
				case UnaryOp("-", x) => -(evaluate(x))
				case BinaryOp("+", x1, x2) => (evaluate(x1) + evaluate(x2))
				case BinaryOp("-", x1, x2) => (evaluate(x1) - evaluate(x2))
				case BinaryOp("*", x1, x2) => (evaluate(x1) * evaluate(x2))
				case BinaryOp("/", x1, x2) => (evaluate(x1) / evaluate(x2))
			}
		}






	}
}