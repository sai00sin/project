import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

import scala.sys.process._

object Main {
  def main(args: Array[String]): Unit = {
    val browser = JsoupBrowser()



    println(Process("ls public/images/") run)
  }
}
