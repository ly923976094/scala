package demo1

/**
  * Created by yodo1 on 17/3/11.
  * Scala访问修饰符
  */
class scalaDemo3 {

}


class Outer {

  class Inner {
    //    private def f(): Unit = {
    //      print("f")
    //    }
    def f(): Unit = {
      print("f")
    }

    class InnerMost {
      f()
    }

  }

  (new Inner).f()

  // private    Error: f is not accessible


  class Super {
    protected def f(): Unit = {
      print("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //  (new Super).f() // // Error: f is not accessible
  }

}




//变量workDetails将可对任何一类封闭包professional范围内。
//
//变量friends 将可对任何一类封闭包society中。
//
//变量secrets 将可只在实例方法隐含的对象（this）。
package society {
  package professional {

    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null


      def help(another : Executive): Unit ={
        println(another.workDetails)
        println(this.secrets)  //ERROR
        println(another.friends)
      }
    }

  }

}