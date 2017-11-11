package implic

/**
  * Created by Administrator on 2017/11/11.
  */
class MissRight[T] {
  //相当于ViewBound
  def choose(first: T, second: T)(implicit ord : T => Ordered[T]): T = {
    if(first > second) first else second
  }
  //相当于ContextBound
  def select(first: T, second: T)(implicit ord : Ordering[T]): T ={
    if(ord.gt(first, second)) first else second
  }

  def random(first: T, second: T)(implicit ord : Ordering[T]): T ={
    import Ordered.orderingToOrdered
    if(first > second) first else second
  }

}

object demo2 {
  def main(args: Array[String]) {
    val mr = new MissRight[Girl]
    val g1 = new Girl("hatanao", 98, 28)
    val g2 = new Girl("sora", 95, 33)

    import implic.demo1.girlToOrdered //视图界定，实现>,<等
    val g = mr.choose(g1, g2)

//    import implic.demo1.girlOrdering //上下文界定实现gt,lt等
//    val g = mr.select(g1, g2)

//    import implic.demo1.girlOrdering//上下文界定用>,<等，内置里隐转Ordered
//    val g = mr.random(g1,g2)
    println(g.name)
  }


}
