package week1.task3

/**
  * Created by alexander.orlyk on 10/30/16.
  */
object SolutionTask3 {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(fibonacci(10))
    println(avgSum(10, 20))
    println(isPalindrom(404))

  }

  //3.1
  def factorial(number: Int): Long =
  if (number == 1 || number == 0) 1
  else number * factorial(number - 1)

  //3.2
  def fibonacci(number: Int): Long =
  if (number > 1) {
    fibonacci(number - 1) + fibonacci(number - 2)
  }
  else number

  //3.3
  def avgSum(a: Int, b: Int): AnyVal =
  if (a > b) 0
  else (a + b) / 2

  //3.4
  def isPalindrom(number: Long): Boolean =
  if ((number > 100) & (number.toString == number.toString.reverse)) true
  else false
}
