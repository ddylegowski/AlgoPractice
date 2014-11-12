package com.ddylegowski.algopractice.util

import com.ddylegowski.algopractice.datastructures.BinaryTreeNode
import static org.junit.Assert.*

class BinaryTreeNodeTestUtil {

	public static void assertTree(ArrayList expected, BinaryTreeNode root) {
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
