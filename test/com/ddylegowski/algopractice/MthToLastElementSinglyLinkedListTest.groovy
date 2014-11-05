package com.ddylegowski.algopractice;

import static org.junit.Assert.*;

import com.ddylegowski.algopractice.datastructures.LinkedListNode
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class MthToLastElementSinglyLinkedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_findMthToLastNode_happyPath() {
		LinkedListNode head = LinkedListNode.fromArrayList([1,2,3,4,5]);
		LinkedListNode mthToLastNode = MthToLastElementSinglyLinkedList.findMthToLastNode(head, 2);
		assertEquals(4, mthToLastNode.value);
	}
	
	@Test
	public void test_findMthToLastNode_mFirstItem() {
		LinkedListNode head = LinkedListNode.fromArrayList([1,2,3,4,5]);
		LinkedListNode mthToLastNode = MthToLastElementSinglyLinkedList.findMthToLastNode(head, 5);
		assertEquals(1, mthToLastNode.value);
	}

	@Test
	public void test_findMthToLastNode_empty() {
		LinkedListNode head = LinkedListNode.fromArrayList([]);
		LinkedListNode mthToLastNode = MthToLastElementSinglyLinkedList.findMthToLastNode(head, 2);
		assertNull(mthToLastNode);
	}
	
	@Test
	public void test_findMthToLastNode_mGreaterThanSize() {
		LinkedListNode head = LinkedListNode.fromArrayList([1,2,3,4,5]);
		LinkedListNode mthToLastNode = MthToLastElementSinglyLinkedList.findMthToLastNode(head, 8);
		assertNull(mthToLastNode);
	}
	
}
