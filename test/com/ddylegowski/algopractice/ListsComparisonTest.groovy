package com.ddylegowski.algopractice;

import static org.junit.Assert.*

import org.junit.Test

class ListsComparisonTest {

	@Test
	public void testListComparison_happyPath() {
		
		def comp = ListsComparison.listsComparison([1,2,3,4], [3,4,5,6]);

		assertEquals([1,2], comp['unique1']);
		assertEquals([5,6], comp['unique2']);
		assertEquals([3,4], comp['shared']);
	}
	
	@Test
	public void testListComparison_firstEmpty() {
		
		def comp = ListsComparison.listsComparison([], [3,4,5,6]);

		assertEquals([], comp['unique1']);
		assertEquals([3,4,5,6], comp['unique2']);
		assertEquals([], comp['shared']);
	}
	
	@Test
	public void testListComparison_secondEmpty() {
		
		def comp = ListsComparison.listsComparison([3,4,5,6], []);

		assertEquals([3,4,5,6], comp['unique1']);
		assertEquals([], comp['unique2']);
		assertEquals([], comp['shared']);
	}
	
	@Test
	public void testListComparison_bothEmpty() {
		
		def comp = ListsComparison.listsComparison([], []);

		assertEquals([], comp['unique1']);
		assertEquals([], comp['unique2']);
		assertEquals([], comp['shared']);
	}
	
}
