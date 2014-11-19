package com.ddylegowski.algopractice.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

class ArrayPrintDuplicatesLittleMemoryTest {

	@Test
	public void test_printDuplicates_happyPath() {
		int[] array = [1,2,3,4,3,5,6,7,8,7,8,9,9];
		String output = ArrayPrintDuplicatesLittleMemory.printDuplicates(array, 10);
		assertEquals("3,7,8,9", output);
	}
	
	@Test
	public void test_printDuplicates_empty() {
		int[] array = [];
		String output = ArrayPrintDuplicatesLittleMemory.printDuplicates(array, 10);
		assertEquals("", output);
	}
	
	@Test
	public void test_printDuplicates_noDuplicates() {
		int[] array = [1,2,3,4];
		String output = ArrayPrintDuplicatesLittleMemory.printDuplicates(array, 10);
		assertEquals("", output);
	}
	
	@Test
	public void test_printDuplicates_largeMax() {
		int max = 32000;
		int[] array = new int[100000];
		Random rand = new Random();
		(0..array.length - 1).each {
			array[it] = rand.nextInt(max);
		}
		String output = ArrayPrintDuplicatesLittleMemory.printDuplicates(array, max);
		assertFalse(output.isEmpty());
	}

}
