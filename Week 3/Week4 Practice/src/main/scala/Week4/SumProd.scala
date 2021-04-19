package Week4

import Week4.exprs.show

object exprs {
  def show (e:Expr) :String = e match {
    case Number(x)  => x.toString
    case Sum (n1,n2) => show(n1) +" + " + show(n2)
    case Prod(n1,n2) => show(n1) +" * " + show(n2)
  }
  show(Sum(Number(1),Number(3)))
}

object Runner {
  def main(args: Array[String]): Unit = {
    print(show(Sum(Number(1),Number(3))))
  }
}