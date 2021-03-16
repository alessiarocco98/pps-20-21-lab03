package lab03

import u02.Modules._
import u02.Modules.Person._
import u03.Lists._
import u03.Lists.List._
import lab03.ListsTasks._

object ListPersonTask {
  def coursesOfTeacher(people: List[Person]): List[String] = flatMap(people)(p => p match {
    case Teacher(_, course) => Cons(course, Nil())
    case _ => Nil()
  })

  def course2(l: List[Person]): List[String] = l match {
    case Cons(Teacher(_, c), t) => append(Cons(c, Nil()), course2(t))
    case Nil() => Nil()
  }
}
