package fizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {	
	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test 
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}
	
	@Test
	void fizz_trois() {
		assertEquals(FizzBuzz.fizzbuzz(3),"fizz");
	}
	
	@Test 
	void fizz_quelques_valeurs() {
		assertEquals(FizzBuzz.fizzbuzz(4),"4");
		assertEquals(FizzBuzz.fizzbuzz(7),"7");

	}
	
	@Test
	void fizz_cinq() {
		assertEquals(FizzBuzz.fizzbuzz(5),"buzz");

	}
	
	@Test 
	void fizz_multiples() {
		assertEquals(FizzBuzz.fizzbuzz(6),"fizz");
		assertEquals(FizzBuzz.fizzbuzz(10),"buzz");
		assertEquals(FizzBuzz.fizzbuzz(9),"fizz");
		assertEquals(FizzBuzz.fizzbuzz(400),"buzz");

	}
	
	@Test
	void fizz_multiples_doubles() {
		assertEquals(FizzBuzz.fizzbuzz(15),"fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(2*3*5),"fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(3*3*5*5),"fizzbuzz");



	}
}
