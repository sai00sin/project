/**
  * Created by inouesaishin on 2017/05/04.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val a = new Action with StrategyA
    val b = new Action with StrategyB
    a.action()
    b.action()
  }
}
