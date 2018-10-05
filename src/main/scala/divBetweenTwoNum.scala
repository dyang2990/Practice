object divBetweenTwoNum
{
  def gcd(a: Int,b: Int): Int = {
    if(b ==0) a else gcd(b, a%b)
  }

  def main(args: Array[String]) {
    println(gcd(12,15))
  }
}