/**
  * Created by inouesaishin on 2017/05/05.
  */

trait Action { self : Strategy =>
  def action() = {
    excute()
  }
}
