package com.pillar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
	@Test
	public void whenFizzBuzzIsPassedNumberItReturnsThatNumber() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.fizz(1));
	}
}
