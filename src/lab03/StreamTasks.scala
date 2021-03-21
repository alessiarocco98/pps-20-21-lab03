package lab03
import u03.Streams._
import u03.Streams.Stream._


object StreamTasks {
  /* 5. */
  def drop[A](stream: Stream[A])(n: Int): Stream[A] = (stream,n) match {
    case (Cons(_, tail), n) if n>0 => drop(tail())(n-1)
    case (Cons(head, tail), n) if n==0 => Cons(head, tail)
    case _ => Empty()
  }

  /* 6. */
  def constant[A](k: A): Stream[A] = iterate(k)(_ => k)

  /* 7. */
  /*
  def fibs(): Stream[Int] = {
    lazy val i: Int = 0
    def fibonacci(n: Int): Stream[Int] = n match {
      case 0 => cons(n, fibonacci(i + 1))
      case 1 => cons(n, fibonacci(i + 1))
      case n if n > 1 => cons(n, fibonacci(n - 1) + fibonacci(n - 2))
    }
  }
   */
  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def _fib(n: Int, a: Int, b:Int): Int = n match {
      case 0 => a
      case 1 => b
      case _ => _fib(n - 1, b, b + a)
    }
    _fib(n, 0, 1)
  }

  val init: Int = 0
  def fibs():Stream[Int] = iterate(init)(fibonacci)
}
