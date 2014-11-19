package com.ddylegowski.algopractice.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

class BitArrayTest {

	@Test
	public void testBitArray_zeroIndex() {
		BitArray bitArray = new BitArray(32);
		bitArray.set(0, true);
		assertTrue(bitArray.get(0));
	}
	
	@Test
	public void testBitArray_oneIndex() {
		BitArray bitArray = new BitArray(32);
		bitArray.set(1, true);
		assertTrue(bitArray.get(1));
	}
	
	@Test
	public void testBitArray_twoIndex() {
		BitArray bitArray = new BitArray(32);
		bitArray.set(2, true);
		assertTrue(bitArray.get(2));
	}
	
	@Test
	public void testBitArray_largeArray() {
		BitArray bitArray = new BitArray(32000);
		int index = 21999;
		bitArray.set(index, true);
		assertTrue(bitArray.get(index));
	}
	
	@Test
	public void testBitArray_multipleValues() {
		BitArray bitArray = new BitArray(32);
		bitArray.set(0, true);
		bitArray.set(1, true);
		assertTrue(bitArray.get(0));
		assertTrue(bitArray.get(1));
		
		bitArray.set(0, false);
		assertFalse(bitArray.get(0));
		assertTrue(bitArray.get(1));
	}

}
