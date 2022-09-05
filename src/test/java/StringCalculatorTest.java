
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

	@Test
	public void
	given_one_number_of_the_number_two() {
		assertEquals(2, StringCalculator.Add("2"));
	}

	@Test
	public void
	given_one_number_of_the_number_three() {
		assertEquals(3, StringCalculator.Add("3"));
	}

	@Test
	public void
	given_two_numbers_of_1_and_2() {
		assertEquals(3, StringCalculator.Add("1,2"));
	}

	@Test
	public void
	given_two_numbers_of_5_and_6() {
		assertEquals(11, StringCalculator.Add("5,6"));
	}
	@Test
	public void
	given_two_numbers_of_4_and_3() {
		assertEquals(7, StringCalculator.Add("4,3"));
	}
	@Test
	public void
	given_three_numbers_of_4_and_3_and_5() {
		assertEquals(12, StringCalculator.Add("4,3,5"));
	}
	@Test
	public void
	given_three_numbers_of_2_and_2_and_2() {
		assertEquals(6, StringCalculator.Add("2,2,2"));
	}

}