/*
   作者:sun
   功能:元组的求和
   日期:2017.3.17
*/

object TupleDemo1 {
    def main(args: Array[String]){
       
     val t = (4,3,2,1)
     val sum = t._1 + t._2 + t._3 + t._4
     println("Sum of elements: " + sum)
    }
}
