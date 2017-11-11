package implic



/**
  * Created by Administrator on 2017/11/11.
  */

class implic11 [T <% Ordered[T]]{

  def choose(first:T,second:T): T ={
    if(first > second) first else second
  }

}

class implic12[T:Ordering]{
  def choose(first:T,second:T):T={
    val ord = implicitly[Ordering[T]]
    if(ord.gt(first,second)) first else second
  }
}

object demo1 {

  implicit def girlToOrdered(girl: Girl) = new Ordered[Girl]{
    override def compare(that: Girl): Int = {
      if(girl.faceValue == that.faceValue) {
        girl.size - that.size
      } else {
        girl.faceValue - that.faceValue
      }
    }
  }

  implicit object girlOrdering extends Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      if(x.faceValue == y.faceValue) {
        x.size - y.size
      } else {
        x.faceValue - y.faceValue
      }
    }
  }

  def main(args: Array[String]): Unit = {

    girlToOrdered
    girlToOrdering

  }

  def girlToOrdered: Unit ={ //视图界定
    import implic.demo1.girlToOrdered
    val im11 = new implic11[Girl]
    val g11 = new Girl("hatanao", 98, 28)
    val g12 = new Girl("sora", 95, 33)
    val g1 = im11.choose(g11, g12)
    println(g1.name)
  }

  def girlToOrdering: Unit ={ //上下文界定
    import implic.demo1.girlOrdering
    val im12 = new implic12[Girl]
    val g21 = new Girl("hatanao", 98, 28)
    val g22 = new Girl("sora", 95, 33)
    val g2 = im12.choose(g21, g22)
    println(g2.name)
  }

}
