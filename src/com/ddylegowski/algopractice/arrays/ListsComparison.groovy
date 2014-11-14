package com.ddylegowski.algopractice.arrays

/**
 * ListsComparison provides a solution to the problem:
 * Given two lists, return a list of elements unique to the first list, a list of elements
 * unique to the second list, and a list of elements shared between the two lists.
 * For Example, [1,2,3,4] and [3,4,5,6] should return [1,2], [5,6], and [3,4]
 */
class ListsComparison {

	/**
	 * This method returns 3 lists: unique1, unique2, and shared.
	 * The time complexity of this algorithm is O(N), with space complexity of O(N)
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static def listsComparison(List<Integer> list1, List<Integer> list2) {
		
		def unique1 = [];
		def unique2 = [];
		def shared = [];
		
		def map = [:]	//value : count
		list1.each {
			map[it] = map.containsKey(it) ? map[it]+1 : 1;
		}
		
		list2.each {
			def val = map[it]
			if (val == null) {
				unique2.add(it)
			} else {
				shared.add(it)
				if (val == 1) {
					map.remove(it)
				} else {
					map[it] = val -1
				}
			}
		}
		
		unique1 = map.keySet().toList()
		
		return [unique1: unique1, unique2: unique2, shared: shared];
	}
	
	
	
	
	
}
