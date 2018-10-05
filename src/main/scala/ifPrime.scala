object ifPrime extends App {

  def isPrime(i:Int):Boolean= {
    if(i<=1)
      false
    else if(i==2)
      true
    else
      !(2 to (i-1)).exists(x => i % x ==0)

  }
  (1 to 100).foreach(i => if (isPrime(i)) println("%d is prime ".format(i)))

}