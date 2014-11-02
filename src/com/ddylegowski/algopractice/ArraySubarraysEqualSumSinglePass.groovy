package com.ddylegowski.algopractice

import java.util.ArrayList;

/**
 * This class solves the same problem as in ArraySubarraysEqualSum, but solves it in a single pass.
 * Note:  The array cannot contain negative numbers for this implementation
 *
 */
class ArraySubarraysEqualSumSinglePass {

	public static boolean containsEqualSumSubarrays(ArrayList<Integer> array) {
		
		if (array.isEmpty()) {
			return false;
		}
		
		//keep track of two positions within the array
		int fromFrontPos = 0;
		int fromEndPos = array.size -1;
		
		int frontSum = 0;
		int endSum = 0;
		
		while (fromFrontPos <= fromEndPos) {
			if (frontSum < endSum) {
				frontSum += array[fromFrontPos];
				fromFrontPos++;
			} else {
				endSum += array[fromEndPos];
				fromEndPos--;
			}
		}
		
		if (frontSum == endSum) {
			return true;
		}
		
		return false;
	}
}
