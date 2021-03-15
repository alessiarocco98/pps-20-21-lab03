package lab03
import u03.Lists._
import u03.Lists.List._

object ListsTasks {

  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Cons(_, t) if n > 0 => drop(t, n - 1)
    case Cons(h, t) if n == 0 => Cons(h, t)
    case _ => Nil()
  }
}