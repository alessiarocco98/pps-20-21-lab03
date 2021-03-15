package lab03
import u03.Lists._
import u03.Lists.List._
import u02.Optionals._
import u02.Optionals.Option._

object ListsTasks {

  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Cons(_, t) if n > 0 => drop(t, n - 1)
    case Cons(h, t) if n == 0 => Cons(h, t)
    case _ => Nil()
  }

  def flatMap[A, B](l: List[A])(f: A => List[B]): List[B] = l match {
    case Cons(h, t) => append(f(h), flatMap(t)(f))
    case Nil() => Nil()
  }

  // c) map in terms of flatMap
  def map[A, B](l: List[A])(f: A => B): List[B] = flatMap(l)(v => Cons(f(v), Nil()))

  // d) filter in terms of flatMap ??
  def filter[A](l: List[A])(f: A=>Boolean): List[A] = l match {
    case Cons(h,t) if (f(h)) => flatMap(t)(v => Cons(v, Nil()))
    case Cons(_,t) => filter(t)(f)
  }
}
