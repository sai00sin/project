/**
  * Created by inouesaishin on 2017/06/11.
  */
trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}