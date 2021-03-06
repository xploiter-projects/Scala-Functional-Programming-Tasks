import org.junit.Assert._
import org.junit.Test
import org.junit._
import scala.annotation.meta.getter

class sieveTest {
  @(Rule @getter)
  def thrown = rules.ExpectedException.none
  
  @Test
  def sieveTest{
    //test 1 : prime numbers upto 20
    val expected = List(2,3,5,7,11,13,17,19)
    val actual = sieve.sieve_prime(20)
    assertEquals(expected,actual)
    
    //test 2 : prime numbers upto 2
    val expected1 = List(2)
    val actual2 = sieve.sieve_prime(2)
    assertEquals(expected,actual)
  }
  
  //exception test
  @Test
  def sieveExceptionTest{
    thrown.expect(classOf[IllegalArgumentException])
    sieve.sieve_prime(1)
  }
}
