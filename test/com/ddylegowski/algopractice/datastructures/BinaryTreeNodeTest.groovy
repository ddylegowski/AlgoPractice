package com.ddylegowski.algopractice.datastructures;

import static org.junit.Assert.*

import org.junit.Test

import com.ddylegowski.algopractice.util.BinaryTreeNodeTestUtil

class BinaryTreeNodeTest {

	@Test
	public void test_fromArrayList_happyPath() {
		def treeArrayList = [6,4,5,3,null,7,null]
		BinaryTreeNode root = BinaryTreeNode.fromArrayList(treeArrayList);
		BinaryTreeNodeTestUtil.assertTree(treeArrayList, root);
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
	

	
}
