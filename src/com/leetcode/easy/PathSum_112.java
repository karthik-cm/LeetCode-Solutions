package com.leetcode.easy;

public class PathSum_112 {

	public static void main(String[] args) {
		
	}
	
	
	// DFS
	boolean flag = false;
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		int sum = 0;
		dfs(root, sum, targetSum);
		return flag;
    }

	
	// Post order traversal : LRP
	private TreeNode dfs(TreeNode root, int sum, int targetSum) {
		if(root == null) {
			return null;
		}
		
		sum += root.val;
		
		TreeNode left = dfs(root.left, sum, targetSum);
		TreeNode right = dfs(root.right, sum, targetSum);
		
		if(left == null && right == null && sum == targetSum) {
			flag = true;
		}
		
		return root;
	}
	
	
	
	
	
	/*public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
        	return false;
        }
        
        if(root.left == null && root.right == null && targetSum-root.val == 0) {
        	return true;
        }
        else {
        	return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
        }
    }*/

}
