object List {
  def main(args: Array[String]) :Unit = {


    val smartPhone = "iPhone" :: "Xperia" :: "Galaxy" :: "Arrows" :: "Nexus" :: Nil
    val target = "Arrows" :: "Galaxy" :: Nil
    val smartPhone2 = smartPhone.filter { target.contains _ }
    println(smartPhone2)

  }
}

// http://engineer-hiko.hatenablog.com/entry/2014/09/22/200038