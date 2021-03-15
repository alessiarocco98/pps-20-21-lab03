package lab03
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import ListsTasks._
import u03.Lists.List._
import u02.Optionals.Option._

class ListsTasksTest {
  val list = Cons(10, Cons(20, Cons(30, Nil())))
  val list2 = Cons(10, Cons(25, Cons(20, Nil())))
  @Test def testDrop():Unit = {
    val expectedDropList1: Cons[Int] = Cons(20, Cons(30, Nil()))
    val expectedDropList2: Cons[Int] = Cons(30, Nil())

    assertEquals(expectedDropList1, drop(list, 1))
    assertEquals(expectedDropList2, drop(list, 2))
    assertEquals(Nil(), drop(list, 5))
  }

  @Test def testFlatMap():Unit = {
    val expectedFlatMapList1 = Cons(11, Cons(21, Cons(31, Nil())))
    val expectedFlatMapList2 = Cons(11, Cons(12, Cons(21, Cons(22, Cons(31, Cons(32, Nil()))))))

    assertEquals(expectedFlatMapList1, ListsTasks.flatMap(list)(v => Cons(v+1, Nil())))
    assertEquals(expectedFlatMapList2, ListsTasks.flatMap(list)(v => Cons(v+1, Cons(v+2, Nil()))))
  }


}
