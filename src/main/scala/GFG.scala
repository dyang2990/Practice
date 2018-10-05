object GFG { // Function calculating  
  // the series
  def summation(n: Int): Int = (n * (n + 1) * (2 * n + 1)) / 6

  // Driver Code
  def main(args: Array[String]): Unit = {
    val n = 10
    System.out.println(summation(n))
  }
}