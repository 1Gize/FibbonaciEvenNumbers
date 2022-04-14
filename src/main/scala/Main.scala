import scala.collection.mutable.ListBuffer

object Main {
  def fib1( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib1( n-1 ) + fib1( n-2 )
  }
  def listOfFibUntil(bound: Int) ={
    val lsFib = new ListBuffer[Int]
    var x = 1
    while(fib1(x) < bound){
      lsFib += fib1(x)
      x += 1
    }
    lsFib.toList
  }
  def sumOfEvenFib(x: Int): Int ={
    val lsEvenFib = new ListBuffer[Int]
    listOfFibUntil(x).foldLeft(lsEvenFib){(z,x) =>
      if(x % 2 == 0){
        z += x
        z
      }else{
        z
      }
    }
    lsEvenFib.toList.sum
  }
}
