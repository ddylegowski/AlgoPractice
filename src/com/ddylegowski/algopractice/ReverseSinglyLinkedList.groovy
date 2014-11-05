package com.ddylegowski.algopractice

import com.ddylegowski.algopractice.datastructures.LinkedListNode

/**
 * ReverseSinglyLinkedList provides a solution to the following problem:
 * Given a singly linked list, reverse the order of the linked list.
 * For example: 1 -> 2 -> 3 becomes 3 -> 2 -> 1
 *
 */
class ReverseSinglyLinkedList {

	/**
	 * Public method for reversing the linked list.  This is a simplified wrapper method for the recursive implementation, which is a private method.
	 * The time complexity of this algorithm is O(N)
	 * @param headNode
	 * @return
	 */
	public static LinkedListNode reverse(LinkedListNode headNode) {		
		return reverseNodes(headNode, null);
	}
	
	/**
	 * Returns a reversed linked list
	 * The time complexity of this algorithm is O(N)
	 * @param curNode
	 * @param prevNode
	 * @return
	 */
	private static LinkedListNode reverseNodes(LinkedListNode curNode, LinkedListNode prevNode) {
		
		//empty list
		if (curNode == null) {
			return curNode;
		}
		
		LinkedListNode nextNode = curNode.getNext();
		curNode.setNext(prevNode);
		
		if (nextNode == null) {
			//curNode is the new head
			return curNode;
		}
		
		return reverseNodes(nextNode, curNode);
	}
}
