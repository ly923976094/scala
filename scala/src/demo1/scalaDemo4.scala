package demo1

/**
  * Created by yodo1 on 17/3/11.
  * Scala闭包
  */
class scalaDemo4 {

}

object Test1 {
  def main(args: Array[String]): Unit = {
    println("muliplier(1) value = " + mmultiplier(1))
    println("muliplier(2) value = " + mmultiplier(2))
  }

  val factor = 3
  val mmultiplier = (i: Int) => i * factor

}


/**
  * List
  */

object Test2{
  def main(args: Array[String]): Unit = {
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    // use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " + fruit )


    fruit = fruit1.:::(fruit2)
    println( "fruit1.:::(fruit2) : " + fruit )

    fruit = List.concat(fruit1, fruit2)
    println( "List.concat(fruit1, fruit2) : " + fruit  )

  }
}



