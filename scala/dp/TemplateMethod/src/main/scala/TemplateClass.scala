/**
  * Created by inouesaishin on 2017/05/05.
  */
abstract class TemplateClass {
  def templateMethod() = {
    this.method1()
    this.method2()
    this.method3()
  }

  protected def method1()
  protected def method2()
  protected def method3()
}
