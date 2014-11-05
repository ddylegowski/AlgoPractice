package com.ddylegowski.algopractice.datastructures

/**
 * LinkedListNode is an implementation of a singly-linked list
 */
class LinkedListNode {

	private LinkedListNode next;
	private Object value;
	
	public LinkedListNode(Object value, LinkedListNode next) {
		this.next = next;
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public Object getValue() {
		return value;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!obj instanceof LinkedListNode) {
			return false;
		}
		
		LinkedListNode objNode = (LinkedListNode)obj;
		LinkedListNode thisNode = this;
		while(objNode != null) {
			
			if (thisNode == null) {
				return false;
			}
			
			if (objNode.value != thisNode.value) {
				return false;
			}
			
			objNode = objNode.getNext();
			thisNode = thisNode.getNext();
		} 
		
		if (thisNode != null) {
			return false;
		}
		
		return true;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	/**
	 * Create a linked link from elements in the array list in the same order
	 * @param list
	 * @return
	 */
	public static LinkedListNode fromArrayList(ArrayList list) {
		
		if (list.isEmpty()) {
			return null;
		}
		
		LinkedListNode nextNode = new LinkedListNode(list.get(list.size()-1), null);
		
		for (int i = list.size()-2; i > -1 ; --i) {
			
			LinkedListNode curNode =  new LinkedListNode(list.get(i), nextNode);
			nextNode = curNode;
		}
		
		return nextNode;	//returns the head
		
	}
	
}
