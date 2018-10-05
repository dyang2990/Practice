object sumOfSqr {

  def summation(n: Int): Int = {
    var sum = 0
    var i = 1
    while ( i <= n) {
      sum += (i * i) (i += 1)
      return sum
    }
  }

  // Driver code
  def main(args: Array[String]): Unit = {
    val n = 2
    println(summation(n))
  }
}