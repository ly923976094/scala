/*
   作者:sun
   功能：串联映射
   日期：2017.3.16
*/

object MapDemo3{

    def main(args:Array[String]){
    val colors = Map("red" -> "#FF0000",
                        "azure" -> "#F0FFFF",
                        "peru" -> "#CD853F")
    colors.keys.foreach{i =>
      print("colors key = " + i)
      println(" value = " + colors(i))
     } 
   }
}
