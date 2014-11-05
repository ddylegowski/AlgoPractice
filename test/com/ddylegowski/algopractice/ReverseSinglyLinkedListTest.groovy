package com.ddylegowski.algopractice;

import static org.junit.Assert.*;

import com.ddylegowski.algopractice.datastructures.LinkedListNode
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class ReverseSinglyLinkedListTest {

	@Test
	public void test_reverse_happyPath() {
		LinkedListNode head = LinkedListNode.fromArrayList([1,2,3,4,5]);
		LinkedListNode revHead = ReverseSinglyLinkedList.reverse(head);
		
		LinkedListNode expectedHead = LinkedListNode.fromArrayList([5,4,3,2,1]);
		assertEquals(expectedHead, revHead);
	}
	
	@Test
	public void test_reverse_oneNode() {
		LinkedListNode head = LinkedListNode.fromArrayList([1]);
		LinkedListNode revHead = ReverseSinglyLinkedList.reverse(head);
		
		LinkedListNode expectedHead = LinkedListNode.fromArrayList([1]);
		assertEquals(expectedHead, revHead);
	}
	
	@Test
	public void test_reverse_empty() {
		LinkedListNode head = LinkedListNode.fromArrayList([]);
		LinkedListNode revHead = ReverseSinglyLinkedList.reverse(head);
		
		LinkedListNode expectedHead = LinkedListNode.fromArrayList([]);
		assertEquals(expectedHead, revHead);
	}
}
