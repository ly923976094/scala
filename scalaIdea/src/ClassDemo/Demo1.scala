package ClassDemo

/**
  * 作者：sun
  * 功能：类的使用
  * Created by yodo1 on 17/3/19.
  */
class Demo1(val xc: Int, val yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x location : " + x)
    println("y location : " + y);
  }


}

class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Demo1(xc, yc) {
  var z: Int = zc

   def move(dx: Int, dy: Int, dz:Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println (" location : " + x);
    println (" location : " + y);
    println (" location : " + z);
  }
}

object Test {

  def main(args: Array[String]): Unit = {

    val pt = new Demo1(10, 20)

    pt.move(10, 10)

    val pt1 =new Location(10,20,15)
    pt1.move(10,10,5)
  }
}