package com.ddylegowski.algopractice

import com.ddylegowski.algopractice.datastructures.LinkedListNode

/**
 * MthToLastElementSinglyLinkedList provides a solution to the following problem:
 * Given a singly linked list, find the mth to last element of the linked list
 * For example: 1 -> 2 -> 3 -> 4 -> 5, m=2 returns 4
 *
 */
class MthToLastElementSinglyLinkedList {

	/**
	 * Find the mth to last element in the linked list.
	 * The time complexity of this algorithm is O(N)
	 * @param head
	 * @param m
	 * @return
	 */
	public static LinkedListNode findMthToLastNode(LinkedListNode head, int m) {
		
		if (head == null) {
			return head;
		}
		
		LinkedListNode curNode = head;
		LinkedListNode trailingNode = null;
		
		//increment m times
		for (int i = 0; i < m; ++i) {
			if (curNode.getNext() != null) {
				curNode = curNode.getNext();
			} else if (i == m-1) {	//capture the first item
				return head;
			} else {
				return null;
			}
		}
		trailingNode = head;	//now set the trailing pointer
		
		//increment until curNode hits the end.  the trailing pointer will be mth to last
		while(curNode != null) {
			curNode = curNode.getNext();
			trailingNode = trailingNode.getNext();
		}
		
		return trailingNode;
	}
	
}
