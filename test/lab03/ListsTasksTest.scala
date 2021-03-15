package lab03
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import ListsTasks._
import u03.Lists.List._

class ListsTasksTest {
  val list = Cons(10, Cons(20, Cons(30, Nil())))
//  val expectedDropList1 = Cons(20, Cons(30, Nil()))
//  val expectedDropList2 = Cons(30, Nil())

  @Test def testDrop():Unit = {
    println(drop(list, 1))
    println(drop(list, 2))
    println(drop(list, 5))

    /*
    assertEquals(expectedDropList1, drop(list, 1))
    assertEquals(expectedDropList2, drop(list, 2))
    assertEquals(Nil(), drop(list, 5))
     */

  }
}
