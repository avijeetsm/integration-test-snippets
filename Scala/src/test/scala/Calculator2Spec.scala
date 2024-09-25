import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Calculator2Spec extends AnyFlatSpec with Matchers {
  "A Calculator" should "correctly add two numbers" in {
    val calculator = new Calculator2
    calculator.add(3, 2) shouldEqual 5
  }

  it should "correctly subtract two numbers" in {
    val calculator = new Calculator2
    calculator.subtract(5, 3) shouldEqual 2
  }
}
