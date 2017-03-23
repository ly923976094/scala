package IteratorDemo

/**
  * 作者：sun
  * 功能：Iterator 的使用
  * Created by yodo1 on 17/3/19.
  */
object Demo1 extends App{

  val it = Iterator("a", "number", "of", "words")
  while(it.hasNext){
    println(it.next())
  }


//note 我们用ita和itb执行两个不同的操作，因为迭代可以被通过一次。
  val ita = Iterator(20,40,2,50,69, 90)
  val itb = Iterator(20,40,2,50,69, 90)

  println("ita max value: " + ita.max)
  println("itb min value: " + itb.min)

//  println(ita.hasNext.toString)
  val ita1 = Iterator(20,40,2,50,69, 90)
  val itb1 = Iterator(20,40,2,50,69, 90)
  println("value of ita.size: " + ita1.size)
  println("value of itb.length: " + itb1.length)




}
