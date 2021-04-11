object exercise {
  print("hello")

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
  }

  print(sum(x => x)(2, 2))


  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  print(product(x => x)(1, 2))

  def fact(n: Int): Int = {
    product(n => n)(1, n)
  }

  print(fact(5))

}