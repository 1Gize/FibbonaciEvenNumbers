import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Main._
class FibSpec extends AnyFlatSpec with should.Matchers {
  "function sumOfEvenFib" should "return 44 for input 100" in{
    sumOfEvenFib(100) shouldBe 44
  }
}
