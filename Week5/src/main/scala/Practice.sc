val list = List(1,2,3,4,5)
list.length
list.last
list.init
list take 2
list drop 2
list(1)
list.reverse


def removeAt(n:Int,list:List[Int]) = (list take n) :::  (list drop n+1)






def squareList1(xs: List[Int]): List[Int] =
  xs match {
    case Nil => Nil
    case y :: ys => y*y :: squareList1(ys)
  }

def squareList2(xs: List[Int]): List[Int] = {
  xs map (x => x*x)
}

squareList2(List(1,2))
squareList1(List(1,2))


def posElems(xs: List[Int]): List[Int] =
  xs match{
    case Nil => Nil
    case y :: ys => if(y>0) y :: posElems(ys) else posElems(ys)
  }

def posElems1(xs: List[Int]): List[Int] = xs filter (y => y>0)

val list1 = List(1,2,-1,3)
val list2 =List(7,8,9)
posElems(list1)
posElems1(list1)

def concat1 (xs:List[Int], ys:List[Int]): List[Int] =
  (xs foldRight ys)(_::_)

//def concat2 (xs:List[Int], ys:List[Int]): List[Int] =
//  (xs foldLeft  ys)( _ :: _)

concat1(list2,list1)

list1.foldRight(0)((x,y) => {
  println(x+" "+ y)
  x
})

list1.foldLeft(0)((x,y) => {
  println(x+" "+ y)
  y
})
val list3 = List(1,2,-1,3)
list1.reduceLeft((x,y) => {
//  println(x+ y)
  x+ y
})