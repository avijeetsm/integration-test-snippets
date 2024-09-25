import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  "A Calculator" should "correctly add two numbers" in {
    val calculator = new Calculator
    calculator.add(3, 2) shouldEqual 5
  }

  it should "correctly subtract two numbers" in {
    val calculator = new Calculator
    calculator.subtract(5, 3) shouldEqual 2
  }

  it should "correctly raise by 2" in {
    val calculator = new Calculator
    calculator.raise(5) shouldEqual 7
  }
}
