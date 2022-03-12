package com.leetcode.easy;

public class PathSum_112 {

	public static void main(String[] args) {
		
	}
	
	
	boolean flag = false;
	
	// DFS
	public boolean hasPathSum(TreeNode root, int targetSum) {
		dfs(root, 0, targetSum);
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
	
}
