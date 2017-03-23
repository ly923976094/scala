package OptionDemo

/**
  * 作者：sun
  * 功能：Option的使用
  * Created by yodo1 on 17/3/19.
  */
object Demo1 {
  def main(args: Array[String]): Unit = {
    //Option
    println("Option")
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    println("capitals.get( \"France\" ) : " + capitals.get("France"))
    println("capitals.get( \"India\" ) : " + capitals.get("India"))

    println("capitals.get( \"France\" ) : " + show(capitals.get("France")))
    println("capitals.get( \"India\" ) : " + show(capitals.get("India")))


    //使用getOrElse()方法
    println("使用getOrElse()方法")
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))


    //使用isEmpty()方法
    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)

  }

  def show(x:Option[String]) = x match {
      case Some(s) => s
      case None => "？"

  }
}
