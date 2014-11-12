package com.ddylegowski.algopractice;

import static org.junit.Assert.*

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import com.ddylegowski.algopractice.datastructures.BinaryTreeNode
import com.ddylegowski.algopractice.util.BinaryTreeNodeTestUtil

class ReconstructTreeFromPreAndPostOrderTraversalsTest {

	@Test
	public void test_reconstructBinaryTree_happyPath() {
		BinaryTreeNode root = ReconstructTreeFromPreAndPostOrderTraversals.reconstructBinaryTree([1,2,4,8,9,5,3,6,7], [8,9,4,5,2,6,7,3,1]);
		BinaryTreeNodeTestUtil.assertTree([1,2,3,4,5,6,7,8,9], root);
	}
	
	@Test
	public void test_reconstructBinaryTree_singleNode() {
		BinaryTreeNode root = ReconstructTreeFromPreAndPostOrderTraversals.reconstructBinaryTree([1], [1]);
		BinaryTreeNodeTestUtil.assertTree([1], root);
	}
	
	@Test
	public void test_reconstructBinaryTree_empty() {
		BinaryTreeNode root = ReconstructTreeFromPreAndPostOrderTraversals.reconstructBinaryTree([], []);
		assertNull(root);
	}

}
