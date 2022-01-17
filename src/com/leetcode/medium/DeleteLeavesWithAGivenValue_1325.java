package com.leetcode.medium;

public class DeleteLeavesWithAGivenValue_1325 {

	public static void main(String[] args) {
		
	}
	
	
	public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null){
            return null;
        }
        
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        
        if(root.left == null && root.right == null && root.val == target){
            root = null;
        }
        
        return root;
    }

}
