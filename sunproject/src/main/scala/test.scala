/**
  * Created by yodo1 on 17/4/20.
  */
object test extends App {

  val t1 = new test
  println(t1.isGiven())


}


class test {
  val x = false
  val y = false

  def isGiven(): Boolean = {
    if (x) {
      if (y)
        true
      else
        false
     // true
    } else
      false
  }
}