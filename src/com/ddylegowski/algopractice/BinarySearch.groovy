package com.ddylegowski.algopractice

/**
 * BinarySearch is an implementation of binary search, which is an O(log N) search algorithm on sorted lists.
 *
 */
class BinarySearch {

	/**
	 * Public method for binary search of a sorted array.  This is a simplified wrapper method for the recursive implementation, which is a private method.
	 * @param item
	 * @param sortedArray
	 * @return
	 */
	public static int binarySearch(Integer item, ArrayList sortedArray) {
		return performBinarySearch(item, sortedArray, 0, sortedArray.size()-1);
	}
	
	/**
	 * Recursive implementation of binary search.  It recurses on the subset of smaller or larger elements in the list.
	 * The time complexity of this algorithm is O(log N)
	 * @param item
	 * @param sortedArray
	 * @param startPos
	 * @param endPos
	 * @return
	 */
	private static int performBinarySearch(Integer item, ArrayList sortedArray, int startPos, int endPos) {
		
		//end the recursion
		if (endPos < startPos) {
			return -1;
		}
		
		int midPos = (endPos - startPos)/2 + startPos;
		
		if (sortedArray[midPos] == item) {
			return midPos;
		} else if (item < sortedArray[midPos]) {	//check the first half
			return performBinarySearch(item, sortedArray, startPos, midPos-1);
		} else {	//check the second half
			return performBinarySearch(item, sortedArray, midPos+1, endPos);
		}

	}
	
}
