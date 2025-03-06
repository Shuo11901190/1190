package month_01

object jiujiuCFB {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 9) {

      val line = (1 to i).map { j =>f"$j×$i=${i * j}%2d"}.mkString("  ")

      println(line)

    }
  }
}
