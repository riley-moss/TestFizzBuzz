package com.pillar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void whenFizzBuzzIsPassedNumberItReturnsThatNumber() {
		assertEquals("1", fizzBuzz.fizz(1));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAtwoItReturnsATwo() {
		assertEquals("2", fizzBuzz.fizz(2));
	}
	
	@Test
	public void whenFizzBuzzIsPassedMultipleOfThreeItReturnsFizz() {
		assertEquals("fizz", fizzBuzz.fizz(3));
		assertEquals("fizz", fizzBuzz.fizz(6));
	}
}
