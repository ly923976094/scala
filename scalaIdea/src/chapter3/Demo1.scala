package chapter3

import scala.io.Source

/**
  * Created by yodo1 on 17/5/8.
  * reduceLeft 使用
  */
class Demo1 {

}


object reduceLeft {

  def widthOfLength(s: String) = s.length.toString.length

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )

      val maxWidth = widthOfLength(longestLine)

      println(longestLine + maxWidth)
      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        print(padding + line.length + "|" + line)
      }
    } else
      Console.err.println("please enter filename")
  }
}