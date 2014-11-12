package com.ddylegowski.algopractice

import com.ddylegowski.algopractice.datastructures.BinaryTreeNode

/**
 * ReconstructTreeFromPreAndPostOrderTraversals provides a solution to the problem:
 * Given the preorder and postorder traversals of a full binary tree,
 * reconstruct the tree.
 *
 */
class ReconstructTreeFromPreAndPostOrderTraversals {

	/**
	 * Public method to reconstruct the tree given the preorder and postorder traversals.
	 * @param preOrder
	 * @param postOrder
	 * @return
	 */
	public static BinaryTreeNode reconstructBinaryTree(ArrayList preOrder, ArrayList postOrder) {
		if (preOrder == null || postOrder == null || preOrder.isEmpty() || postOrder.isEmpty()) {
			return null;
		}
		
		BinaryTreeNode root = new BinaryTreeNode(preOrder.get(0), null, null);
		constructBinaryTree(root, preOrder, 0, postOrder, postOrder.size()-1);
		return root;
	}
	
	/**
	 * Recursive method to reconstruct a full binary tree give the preorder and postorder traversals
	 * The algorithm works as follows:
	 * The potential left node of root is preOrder[preIndex+1].  The potential index must be valid, and the value must occur before postIndex in postOrder.
	 * The potential right node of root is postOrder[postIndex-1].  The potential index must be valid, and the value must occur after preIndex in preOrder.
	 * If the left node exists, recurse on the left.
	 * If the right node exists, recurse on the right.
	 * @param root
	 * @param preOrder
	 * @param preIndex the index of root in preOrder
	 * @param postOrder
	 * @param postIndex the index of root in postOrder
	 */
	private static void constructBinaryTree(BinaryTreeNode root, ArrayList preOrder, int preIndex, ArrayList postOrder, int postIndex) {
		
		BinaryTreeNode left = null;
		BinaryTreeNode right = null;

		int potentialLeftIndex = preIndex + 1;
		//is the potentialLeftIndex valid in preOrder, and does the potential node come before the postIndex in postOrder?
		if (potentialLeftIndex < preOrder.size() && postOrder.findIndexOf { it == preOrder[potentialLeftIndex]} <= postIndex) {
			left = new BinaryTreeNode(preOrder.get(potentialLeftIndex), null, null);
			root.setLeft(left);
		}

		int potentialRightIndex = postIndex - 1;
		//if the potentialRightIndex valid in postOrder, and does the potential node come after the preIndex in preOrder?
		if (potentialRightIndex > -1 && preOrder.findIndexOf { it == postOrder[potentialRightIndex] } > preIndex) {
			right = new BinaryTreeNode(postOrder.get(potentialRightIndex), null, null);
			root.setRight(right);
		}

		//recurse on the left node
		if (left != null) {
			constructBinaryTree(left, preOrder, preIndex+1, postOrder, postOrder.findLastIndexOf { it == left.getValue() });
		}
		
		//recurse on the right node
		if (right != null) {
			constructBinaryTree(right, preOrder, preOrder.findIndexOf {it == right.getValue() }, postOrder, postIndex-1);
		}
	}
	
	
}
