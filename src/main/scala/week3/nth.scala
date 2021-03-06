package week3

object nth {
  def main(args: Array[String]): Unit = {
    val list = new Cons(1, new Cons(2, new Cons(3, Nil)))
    println(nth(2, list))
    println(nth(3, list))
  }

  def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }
}
