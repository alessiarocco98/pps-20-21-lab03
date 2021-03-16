package lab03

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import lab03.ListPersonTask._
import u02.Modules.Person
import u02.Modules.Person._
import u03.Lists._
import u03.Lists.List._

class ListPersonTaskTest {
  val people: List[Person] = Cons(Student("io", 1), Cons(Teacher("Viroli", "PPS"), Cons(Teacher("Ricci", "PCD"), Nil())))
  val students: List[Person] = Cons(Student("io", 1), Cons(Student("tu", 2), Cons(Student("lui", 1), Nil())))
  val coursesExpected: Cons[String] = Cons("PPS", Cons("PCD", Nil()))

  @Test def testCourses():Unit = {
    assertEquals(coursesExpected, coursesOfTeacher(people))
    assertEquals(Nil(), coursesOfTeacher(students))
  }

}
