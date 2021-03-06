package week2

import scala.annotation.tailrec

object Lecture2_1 {
  def main(args: Array[String]): Unit = {
    println(sumInts(3, 5))
    println(sumFactorials(3, 4))
  }

//  def sumInts(a: Int, b: Int): Int = {
//    if (a > b) 0
//    else a + sumInts(a + 1, b)
//  }
//
//  def sumCubes(a: Int, b: Int): Int = {
//    if(a > b) 0
//    else cube(a) + sumCubes(a + 1, b)
//  }
//
//  def sumFactorials(a: Int, b: Int): Int = {
//    if(a > b) 0
//    else fact(a) + sumFactorials(a + 1, b)
//  }

  // -----------------------------------
  // Summing with Higher Order Functions
  // -----------------------------------

//  def sum(f: Int => Int, a: Int, b: Int): Int = {
//    if (a > b) 0
//    else f(a) + sum(f, a + 1, b)
//  }

  def id(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if (x == 0) 1 else  x * fact(x - 1)

//  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
//  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)
  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)

  // ---------------------------------
  // Summation with anonymous function
  // ---------------------------------

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)
//  def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x)(a, b)

  // Rewrite function sum into tail recursive function
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  // The function above can also be written in the way below:
//  def sum(f: Int => Int)(a: Int, b: Int) : Int = {
//    ...
//  }
}
