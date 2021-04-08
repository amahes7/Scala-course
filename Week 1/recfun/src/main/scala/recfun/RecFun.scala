package recfun

import java.util

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    val a = "$colon$minus)"
    print(balance(a.toList))
  }

    def main(args: Array[String]): Unit = {

      print(countChange(4,List(1,2)))
    }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def util(chars: List[Char], pOpen: Int): Boolean = {
      if (chars.isEmpty) pOpen == 0
      else {
        val head = chars.head
        val count = {
          if (head == '(') pOpen + 1
          else if (head == ')') pOpen - 1
          else pOpen
        }
        if (count >= 0) util(chars.tail, count)
        else false
      }
    }

    util(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(money: Int, coins: List[Int]): Int = {
      if (money < 0 || coins.isEmpty) 0
      else if (money == 0) 1
      else loop(money, coins.tail) + loop(money - coins.head, coins)
    }
    loop(money, coins)
  }
}
