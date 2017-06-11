import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import net.ruippeixotog.scalascraper.model._
import scala.sys.process._

import net.ruippeixotog.scalascraper.browser.HtmlUnitBrowser
import net.ruippeixotog.scalascraper.browser.HtmlUnitBrowser._

import java.io.PrintWriter


/**
  * Created by user on 2017/06/03.
  */







object Main {
  def main(args: Array[String]): Unit = {
    val browser = JsoupBrowser()

    // 1
    val jirouHibarigaoka = browser.get("https://tabelog.com/en/tokyo/A1328/A132801/13024745/")
    val numStarsHibarigaoka = jirouHibarigaoka >> text(".rd-header__rst-rate li")
    val nameStarsHibarigaoka = jirouHibarigaoka >> text(".rd-header__rst-name-ja")
    val resultHibarigaoka = nameStarsHibarigaoka + "：" + "☆ " + numStarsHibarigaoka

    // 2
    val jirouMejiromaehouseidaigakumae = browser.get("https://tabelog.com/en/tokyo/A1329/A132904/13010397/")
    val numStarsMejiromaehouseidaigakumae = jirouMejiromaehouseidaigakumae >> text(".rd-header__rst-rate li")
    val nameStarsMejiromaehouseidaigakumae = jirouMejiromaehouseidaigakumae >> text(".rd-header__rst-name-ja")
    val resultMejiromaehouseidaigakumae = nameStarsMejiromaehouseidaigakumae + "：" + "☆ " + numStarsMejiromaehouseidaigakumae

    // 3
    val jirouMitahonten = browser.get("https://tabelog.com/en/tokyo/A1314/A131402/13006051/")
    val numStarsMitahonten = jirouMitahonten >> text(".rd-header__rst-rate li")
    val nameStarsMitahonten = jirouMitahonten >> text(".rd-header__rst-name-ja")
    val resultMitahonten = nameStarsMitahonten + "：" + "☆ " + numStarsMitahonten

    var html: String = "<div><ul>" + "<li>" + resultHibarigaoka + "</li>" + "<li>" + resultMejiromaehouseidaigakumae + "</li>" + "<li>" + resultMitahonten + "</li>" + "</ul></div>"
    val doc = browser.parseString(html)

    val outResult = new PrintWriter("./html/result.html")
    outResult.println(doc)
    outResult.close

  }
}