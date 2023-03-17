package com.knoldus.functionalprogramming

object SyntacticSugar {
  /* val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
      This is expanded into the following object code.
   */
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(num1: Int, num2: Int): Int = num1 + num2
  }
  //add(10, 11)

  /* val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
      This is expanded into the following object code.
   */
  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }
  //sumOfList(List(4, 5, 6))

  /* val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
      This is expanded into the following object code.
   */
  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    override def apply(f: Int => Int, num: Int): Int = f(num)
  }
  //higherOrderFunction((num: Int) => num + num, 10)
}
