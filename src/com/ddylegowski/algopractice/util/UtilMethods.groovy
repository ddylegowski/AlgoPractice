package com.ddylegowski.algopractice.util

class UtilMethods {

	/**
	 * Calculates the sum of all elements in the array
	 * @param array
	 * @return
	 */
	public static int sumArray(ArrayList<Integer> array) {
		int sum = 0;
		array.each {
			sum += it;
		}
		return sum;
	}
	
	
}
