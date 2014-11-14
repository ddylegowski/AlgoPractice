package com.ddylegowski.algopractice.strings;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ddylegowski.algopractice.strings.StringToInteger;

class StringToIntegerTest {

	final shouldFail = new GroovyTestCase().&shouldFail

	@Test
	public void test_stringToInteger_singleDigit() {
		assertEquals(5, StringToInteger.stringToInteger("5"));
	}
	
	@Test
	public void test_stringToInteger_singleDigit_negative() {
		assertEquals(-5, StringToInteger.stringToInteger("-5"));
	}
	
	@Test
	public void test_stringToInteger_zero() {
		assertEquals(0, StringToInteger.stringToInteger("0"));
	}
	
	@Test
	public void test_stringToInteger() {
		assertEquals(999, StringToInteger.stringToInteger("999"));
	}
	
	@Test
	public void test_stringToInteger_empty() {
		shouldFail(ArithmeticException) {
			int value = StringToInteger.stringToInteger("")
		}
	}
	
	@Test
	public void test_stringToInteger_nonNumericString() {
		shouldFail(ArithmeticException) {
			int value = StringToInteger.stringToInteger("abc")
		}
	}

}
