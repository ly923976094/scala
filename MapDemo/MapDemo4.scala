/*
   作者:sun
   功能：检查映射中的键
   日期：2017.3.16
*/

object MapDemo4{

    def main(args:Array[String]){
         val colors = Map("red" -> "#FF0000",
                          "azure" -> "#F0FFFF",
                          "peru" -> "#CD853F")
        if(colors.contains("red")){
             println("red key exists with value :" + colors("red"))
        }else{
             println("red key dose not exist")
        }
        if(colors.contains("maroon")){
             println("maroon key exists with value :" + colors("maroon"))
        }else{
             println("maroon key dose not exist")
        }
     
   }
}
