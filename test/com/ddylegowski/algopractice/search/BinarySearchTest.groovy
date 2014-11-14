package com.ddylegowski.algopractice.search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ddylegowski.algopractice.search.BinarySearch;

class BinarySearchTest {

	@Test
	public void test_binarySearch_happyPath() {
		assertEquals(3, BinarySearch.binarySearch(3, [0,1,2,3,4,5]));
	}
	
	@Test
	public void test_binarySearch_notInArray() {
		assertEquals(-1, BinarySearch.binarySearch(6, [0,1,2,3,4,5]));
	}
	
	@Test
	public void test_binarySearch_firstItem() {
		assertEquals(0, BinarySearch.binarySearch(0, [0,1,2,3,4,5]));
	}
	
	@Test
	public void test_binarySearch_lastItem() {
		assertEquals(5, BinarySearch.binarySearch(5, [0,1,2,3,4,5]));
	}

}
