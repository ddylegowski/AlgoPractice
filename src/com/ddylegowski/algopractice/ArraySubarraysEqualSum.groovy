package com.ddylegowski.algopractice

import com.ddylegowski.algopractice.util.UtilMethods

/**
 * ArrayEqualHalves provides a solution to the problem:
 * Given a list of integers, can this list be split into 2 subarrays,
 * where the sum of the first subarray is equal to the second subarray?
 * For example, [1,5,2,4] can be split into [1,5] and [2,4]
 *
 */
class ArraySubarraysEqualSum {

	/** 
	 * This method returns where the array can be split into 2, where the sum of each part is equal.
	 * The complexity of this algorithm is O(N): O(N) to calculate the sum + O(N) to find where the array can be split -> O(N)
	 * @param array
	 * @return
	 */
	public static boolean containsEqualSumSubarrays(ArrayList<Integer> array) {
		
		int sum = UtilMethods.sumArray(array);	//O(N)
		boolean sumOdd = sum.mod(2) == 1;
		
		if (sumOdd) {
			return false;
		}
		
		int halfSum = sum /2;
		
		int curSum = 0;
		for (int i : array) {	//O(N)
			curSum += i;
			if (curSum == halfSum) {
				return true;
			}
		}
		
		return false;
	}
	

}
