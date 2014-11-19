package com.ddylegowski.algopractice.datastructures

/**
 * BitArray is a data structure used to store an array of bits. It is optimized for space, using N/32 ints.
 *
 */
class BitArray {

	private int[] array;
	
	public BitArray(int size) {
		if (size < 32) {
			array = new int[1];
		} else {
			array = new int[size >> 5]; //each int holds 2^5 values
		}
	}
	
	public void set(int index, boolean value) throws ArrayIndexOutOfBoundsException {
		int arrayIndex = index / 32;
		
		if (arrayIndex >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int curValue = array[arrayIndex];
		int offset = index % 32;
		int setValue = value == true ? 1 : 0;
		if (value) {
			curValue = curValue | (1 << offset);
		} else {	//and with the complement
			curValue = curValue & ~(1 << offset);
		}
		array[arrayIndex] = curValue;
		
	}
	
	public boolean get(int index) throws ArrayIndexOutOfBoundsException {
		int arrayIndex = index / 32;
		
		if (arrayIndex >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int offset = index % 32;
		int masked = array[arrayIndex] & (1 << offset);	//isolate the bit
		return masked != 0;
	}
}
