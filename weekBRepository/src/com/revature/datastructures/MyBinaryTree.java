package com.revature.datastructures;

public class MyBinaryTree {
	private TreeNode root;
	// add a new value to the tree
	public void add(int value) {
		root = addRecursive(root, value);
		
	}
	
	private TreeNode addRecursive(TreeNode current, int value) {
		
		if(current == null) {
			return new TreeNode(value);
		}
		
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
			
		} else if ( value > current.value) {
			current.right = addRecursive(current.right, value);
		}
		return current;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	
	// determine size of tree
	public int getSize() {
		return getSizeRecursive(root);
	}
	
	private int getSizeRecursive(TreeNode current) {
		// ternary operator: [condition] ? [value to return if condition is true] : [value to return if condition is false
		return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
	}
	
	public boolean containsNode(int value) {
		
		
		
		
			
		
				
		return false; }
	
	private class TreeNode {
		
		//inner class
		// we never actually need TreeNode outside the binary tree
		// can't make this public
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value) {
			
			this.value = value;
			right = null;
			left = null;
					
		}
		
	}

}
