package com.ddylegowski.algopractice.arrays;

import static org.junit.Assert.*

import org.junit.AfterClass
import org.junit.Test

import com.ddylegowski.algopractice.arrays.ArraySubarraysEqualSum;
import com.ddylegowski.algopractice.arrays.ArraySubarraysEqualSumSinglePass;

class ArraySubarraysEqualSumSinglePassTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testContainsEqualHalves_evenSplit() {
		assertTrue(ArraySubarraysEqualSumSinglePass.containsEqualSumSubarrays([3,6,4,5]));
	}
	
	@Test
	public void testContainsEqualHalves_unevenSplit() {
		assertTrue(ArraySubarraysEqualSumSinglePass.containsEqualSumSubarrays([1,3,5,4,5]));
	}
	
	@Test
	public void testContainsEqualHalves_allZeroes() {
		assertTrue(ArraySubarraysEqualSumSinglePass.containsEqualSumSubarrays([0,0,0,0]));
	}
	
	@Test
	public void testContainsEqualHalves_empty() {
		assertFalse(ArraySubarraysEqualSumSinglePass.containsEqualSumSubarrays([]));
	}
	
	@Test
	public void ArraySubarraysEqualSumSinglePass() {
		assertFalse(ArraySubarraysEqualSum.containsEqualSumSubarrays([1]));
	}

}
