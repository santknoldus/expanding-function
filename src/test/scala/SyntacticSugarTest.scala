package com.knoldus.functionalprogramming

import org.scalatest.funsuite.AnyFunSuite

class SyntacticSugarTest extends AnyFunSuite {
  test("add should return the sum of two numbers") {
    assert(SyntacticSugar.add(10, 11) == 21)
    assert(SyntacticSugar.add(-5, 7) == 2)
    assert(SyntacticSugar.add(0, 0) == 0)
  }

  test("sumOfList should return the sum of all elements in a list of integers") {
    assert(SyntacticSugar.sumOfList(List(4, 5, 6)) == 15)
    assert(SyntacticSugar.sumOfList(List(-2, 0, 2)) == 0)
    assert(SyntacticSugar.sumOfList(List()) == 0)
  }

  test("higherOrderFunction should apply the given function to the given integer") {
    assert(SyntacticSugar.higherOrderFunction((num: Int) => num + num, 10) == 20)
    assert(SyntacticSugar.higherOrderFunction((num: Int) => num * 2, 5) == 10)
    assert(SyntacticSugar.higherOrderFunction((num: Int) => num / 2, 8) == 4)
  }
}
