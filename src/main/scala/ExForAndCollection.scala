object ExForAndCollection {
  def main(args: Array[String]) {
    //declare an integer
    var N: Int=0;

    //declare integer list
    var numbers = List(1,2,3,4,5,6,7,8,9,10);

    //to print all numbers using for loop
    for(N<-numbers){
      println(N);
    }
    var sum: Int=0;
    for ( N <- numbers ) {
      sum+=N;
    }
    println("Sum of all array elements: "+sum);

  }
}