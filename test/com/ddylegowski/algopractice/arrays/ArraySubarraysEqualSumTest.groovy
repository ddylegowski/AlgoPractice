package com.ddylegowski.algopractice.arrays;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ddylegowski.algopractice.arrays.ArraySubarraysEqualSum;

class ArraySubarraysEqualSumTest {
	
	@Test
	public void testContainsEqualHalves_happyPath() {
		assertTrue(ArraySubarraysEqualSum.containsEqualSumSubarrays([3,6,4,5]));
	}
	
	@Test
	public void testContainsEqualHalves_allZeroes() {
		assertTrue(ArraySubarraysEqualSum.containsEqualSumSubarrays([0,0,0,0]));
	}
	
	@Test
	public void testContainsEqualHalves_containsNegatives() {
		assertTrue(ArraySubarraysEqualSum.containsEqualSumSubarrays([-1,4,5,-2]));
	}
	
	@Test
	public void testContainsEqualHalves_allNegatives() {
		assertTrue(ArraySubarraysEqualSum.containsEqualSumSubarrays([-1,-4,-3,-2]));
	}
	
	@Test
	public void testContainsEqualHalves_empty() {
		assertFalse(ArraySubarraysEqualSum.containsEqualSumSubarrays([]));
	}
	
	@Test
	public void testContainsEqualHalves_size1() {
		assertFalse(ArraySubarraysEqualSum.containsEqualSumSubarrays([1]));
	}
}
