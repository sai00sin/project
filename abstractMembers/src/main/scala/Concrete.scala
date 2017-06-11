/**
  * Created by inouesaishin on 2017/06/11.
  */
class Concrete extends Abstract {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
}
