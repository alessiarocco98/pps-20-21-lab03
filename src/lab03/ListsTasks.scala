package lab03
import u03.Lists._
import u03.Lists.List._
import u02.Optionals._
import u02.Optionals.Option._

import scala.annotation.tailrec

object ListsTasks {

  @tailrec
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

  // d) filter in terms of flatMap
  @tailrec
  def filter[A](l: List[A])(f: A=>Boolean): Any = l match {
    case Cons(h,t) if f(h) => flatMap(t)(v => Cons(v, Nil()))
    case Cons(_,t) => filter(t)(f)
  }

  def max(l: List[Int]): Option[Int] = {
    @tailrec
    def _max(l: List[Int], _maximum: Int): Option[Int] = l match {
      case Nil() if _maximum != -1 => Some(_maximum)
      case Cons(h, t) if h >= _maximum => _max(t, h)
      case Cons(h, t) if h < _maximum => _max(t, _maximum)
      case _ => None()
    }
    _max(l, -1)
  }
}
