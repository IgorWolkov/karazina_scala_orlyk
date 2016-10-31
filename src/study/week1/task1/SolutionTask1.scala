package study.week1.task1

/**
  * Created by orlyk on 30.10.16.
  */
object SolutionTask1 {

  def and(x: Boolean, y: Boolean): Boolean =
    if (x) {
      if (y) y else y
    } else x

  def or(x: Boolean, y: => Boolean): Boolean =
    if (x) x
    else x

  def main(args: Array[String]): Unit = {
    println(or(true, false))
    println(or(false, true))
    println(or(false, false))
    println(or(true, true))
    println(and(true, false))
    println(and(false, true))
    println(and(false, false))
    println(and(true, true))
  }
}
