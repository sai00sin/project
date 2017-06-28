package com.tedneward.calcds1.test
{
	class CalcTest
	{
		import org.junit._, Assert._

		@Test def ASTTest =
		{
			val n1 = Number(5)
			assertEquals(5, n1.value)
		}

		@Test def equalityTest =
		{
			val binop = BinaryOp("+", Number(5), Number(10))

			assertEquals(Number(5), binop.left)
			assertEquals(Number(10), binop.right)
			assertEquals("+", binop.operator)
		}
	}
}