import ConsecutiveDuplicates.{encode, pack}

object ConsecutiveDuplicates {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
    }
  }

  def pack1[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      val (first, rest) = xs partition  (y => y == x)
      first :: pack(rest)
    }
  }

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))

  def encode1[T](xs: List[T]): List[(T, Int)] =
    pack1(xs) map (ys => (ys.head, ys.length))


  def main(args: Array[String]): Unit = {
    val data = List('a', 'a', 'a', 'b', 'b', 'c', 'a')
    println(pack(data))
    println(encode(data))

    println(pack1(data))
    println(encode1(data))
  }
}
