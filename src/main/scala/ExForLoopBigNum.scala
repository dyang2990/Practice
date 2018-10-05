object ExForLoopBigNum {
  def main(args: Array[String]) {
    var counter: Int=0;

    for(counter <- 1 until 100001)
      println(counter + " ");

    // to print new line
    println();
  }
}
