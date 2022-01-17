package com.leetcode.medium;

public class CountGoodNodesInBinaryTree_1448 {

	public static void main(String[] args) {
		
	}
	
	
	int count = 0;
    
	
	// DFS
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return count;
    }
    
    private void dfs(TreeNode root, int max) {
        if(root == null)
            return;
        
        if(root.val >= max){
            count += 1;
            max = root.val;
        }
        
        dfs(root.left, max);
        
        dfs(root.right, max);
    }

}
