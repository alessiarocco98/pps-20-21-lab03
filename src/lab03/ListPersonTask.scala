package lab03

import u02.Modules._
import u02.Modules.Person._
import u03.Lists._
import u03.Lists.List._
import lab03.ListsTasks._

object ListPersonTask {
  /* 3. */
  def coursesOfTeacher(people: List[Person]): List[String] = flatMap(people)(p => p match {
    case Teacher(_, course) => Cons(course, Nil())
    case _ => Nil()
  })

}
