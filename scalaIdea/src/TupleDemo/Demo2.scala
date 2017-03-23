package TupleDemo

/**
  * 作者：sun
  * 功能：元组的使用
  * Created by yodo1 on 17/3/19.
  */
object Demo2 {

  def main(args: Array[String]): Unit = {

    //遍历元组
    println("遍历元组")
    val t1 = (4, 3, 2, 1)
    t1.productIterator.foreach(i => println("value = " + i))

    //转换为字符串
    println("转换为字符串")
    val t2=new Tuple3(1,"hello",Console)
    println("Concatenated String: " + t2.toString() )

    //交换元素
    println("交换元素")
    val t3 = new Tuple2("scala","hello")
    println("swapped tuole: " + t3.swap)


  }

}
