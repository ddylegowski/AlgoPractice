package com.ddylegowski.algopractice.datastructures

import java.util.ArrayList;

/**
 * BinaryTreeNode is an implementation of a binary tree
 */
class BinaryTreeNode {

	private Object value;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	/**
	 * Construct a binary tree node
	 * @param value
	 * @param left
	 * @param right
	 */
	public BinaryTreeNode(Object value, BinaryTreeNode left,
			BinaryTreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public Object getValue() {
		return value;
	} 

	public void setValue(Object value) {
		this.value = value;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	/**
	 * Given an ArrayList, construct a binary tree
	 * The tree is constructed as follows:  
	 * If the element in the ArrayList at position i is not null, it's left child is at position 2i+1 and the right at 2i+2
	 * @param list
	 * @return
	 */
	public static BinaryTreeNode fromArrayList(ArrayList list) {

		if(list == null || list.isEmpty()) {
			return null;
		}
		
		//level-order traversal to create the tree
		BinaryTreeNode root = new BinaryTreeNode(list.get(0), null, null);
		def queue = new LinkedList();
		queue.push(root);
		
		for(int i = 0; i < list.size(); ++i) {
			
			BinaryTreeNode curNode = queue.poll();
			if (curNode != null) {
				int leftIndex = 2*i+1;
				if (leftIndex < list.size()) {
					Object leftValue = list.get(leftIndex);
					if (leftValue != null) {
						BinaryTreeNode leftNode = new BinaryTreeNode(leftValue, null, null);
						curNode.setLeft(leftNode);
						queue.push(leftNode);
					}
					
					int rightIndex = leftIndex + 1;
					if (rightIndex < list.size()) {
						Object rightValue = list.get(rightIndex);
						if (rightValue != null) {
							BinaryTreeNode rightNode = new BinaryTreeNode(rightValue, null, null);
							curNode.setRight(rightNode);
							queue.push(rightNode);
						}
					}
				}
			}
		}
		
		return root;
	}
	
}
