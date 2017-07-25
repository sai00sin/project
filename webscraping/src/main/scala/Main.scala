import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import net.ruippeixotog.scalascraper.browser.JsoupBrowser




import java.io.{FileOutputStream, BufferedOutputStream}
import java.net.URL
import scala.language.postfixOps






/**
  * Created by inouesaishin on 2017/05/16.
  */
object Main {
  def main(args: Array[String]): Unit = {


    val image_url = "http://cdn.narinari.com/site_img/photo2/2015-09-14-114817.jpg"
    val file_name = "public/images/beauty.jpg"
    download(image_url, file_name)






/*
    val browser = JsoupBrowser()
    val doc = browser.get("http://example.com/")

    println(doc)
*/

  }



  def download(url: String, file_name: String) = {
    val stream = new URL(url).openStream
    val buf = Stream.continually(stream.read).takeWhile( -1 != ).map(_.byteValue).toArray
    val bw = new BufferedOutputStream(new FileOutputStream(file_name))
    bw.write(buf)
    bw.close
  }




}