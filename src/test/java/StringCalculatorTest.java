
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

	@Test
	public void
	given_an_empty_string_return_zero() {
		assertEquals(0, StringCalculator.Add(""));
	}

	@Test
	public void
	given_one_number_of_the_number_one() {
		assertEquals(1, StringCalculator.Add("1"));
	}


}