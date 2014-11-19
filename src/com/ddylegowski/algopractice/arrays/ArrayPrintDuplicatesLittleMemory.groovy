package com.ddylegowski.algopractice.arrays

import com.ddylegowski.algopractice.datastructures.BitArray

/**
 * ArrayPrintDuplicatesLittleMemory provides a solution to the problem:
 * Given an a large array containing ints in the range [0, N], and very limited memory (i.e. 4kb),
 * print the duplicates
 */
class ArrayPrintDuplicatesLittleMemory {

	/**
	 * Method that returns a csv string of all the duplicated in order.
	 * @param array
	 * @param maxValue
	 * @return
	 */
	static String printDuplicates(int[] array, int maxValue) {
		BitArray valueSeenArray = new BitArray(maxValue);
		StringBuilder builder = new StringBuilder();
		
		for (int val : array) {
			if (valueSeenArray.get(val) == true) {
				builder.append(String.valueOf(val));
				builder.append(',');
			}
			valueSeenArray.set(val, true);
		}
		
		if (builder.length() > 0) {	//remove the last ','
			builder.deleteCharAt(builder.length()-1);
		}
		
		return builder.toString();
	}
}
