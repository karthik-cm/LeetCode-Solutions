package com.leetcode.easy;

public class MaxHeightOfATree {
	
	public static void main(String[] args) {
		
	}
	
	
	// Recursion Approach
	public int maxHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int leftHeight = maxHeight(root.left);
        
        int rightHeight = maxHeight(root.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }

}

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode() {}
	 
	 TreeNode(int val) { this.val = val; }
	 
	 TreeNode(int val, TreeNode left, TreeNode right) {
	     this.val = val;
	     this.left = left;
	     this.right = right;
	 }
}
