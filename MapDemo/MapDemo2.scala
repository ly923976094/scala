/*
   作者:sun
   功能：串联映射
   日期：2017.3.16
*/

object MapDemo2{

    def main(args:Array[String]){
    val colors1 = Map("red" -> "#FF0000",
                        "azure" -> "#F0FFFF",
                        "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
                        "yellow" -> "#FFFF00",
                        "red" -> "#FF0000")
    var colors = colors1 ++ colors2
    println( "colors1 ++ colors2 : " + colors )
    colors = colors1.++(colors2)
    println( "colors1 ++ colors2 : " + colors )
   
   }
}
