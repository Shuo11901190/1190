package month_01

object sxhua {
    def main(args: Array[String]): Unit = {
      //输出100-999的水仙花数
      for(i <- 100 to 999){
        // 个位 十位 百位
        var gewei = i % 10
        var shiwei = i /10 % 10
        var baiwei = i /100
        if(i == gewei * gewei * gewei + shiwei * shiwei * shiwei +baiwei *baiwei * baiwei ){
          println(i)
        }
      }
    }
}
