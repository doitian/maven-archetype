package samples

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.junit.runner.RunWith

import scala.collection.mutable.Stack

@RunWith(classOf[JUnitRunner])
class StackSpec extends FunSpec with BeforeAndAfter {
  describe("A Stack") {
    it("should pop values in last-in-first-out order") {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it("should throw NoSuchElementException if an empty stack is popped") {
      val emptyStack = new Stack[Int]
      intercept[NoSuchElementException] {
        emptyStack.pop()
      }
    }
  }
}
