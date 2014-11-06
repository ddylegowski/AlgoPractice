package com.ddylegowski.algopractice.datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class BinaryTreeNodeTest {

	@Test
	public void test_fromArrayList_happyPath() {
		def treeArrayList = [6,4,5,3,null,7,null]
		BinaryTreeNode root = BinaryTreeNode.fromArrayList(treeArrayList);
		assertTree(treeArrayList, root);
	}

	@Test
	public void test_fromArrayList_onlyRoot() {
		def treeArrayList = [5]
		BinaryTreeNode root = BinaryTreeNode.fromArrayList(treeArrayList);
		assertEquals(5, root.getValue());
		assertEquals(null, root.getLeft());
		assertEquals(null, root.getRight());
	}
	
	@Test
	public void test_fromArrayList_null() {
		def treeArrayList = [null]
		BinaryTreeNode root = BinaryTreeNode.fromArrayList(treeArrayList);
		assertEquals(null, root.getValue());
		assertEquals(null, root.getLeft());
		assertEquals(null, root.getRight());
	}
	
	private void assertTree(ArrayList expected, BinaryTreeNode root) {
		def queue = new LinkedList();
		def treeAsArray = new ArrayList(expected.size);
		
		//level-order traversal to construct the arraylist
		queue.push(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode curNode = queue.poll();
			if (curNode != null) {
				queue.push(curNode.getLeft());
				queue.push(curNode.getRight());
				treeAsArray.push(curNode.getValue());
			} else {
				treeAsArray.push(null);
			}
			
			if (treeAsArray.size == expected.size) {
				break;
			}
		}
		
		assertEquals(expected, treeAsArray);
	}
	
}
