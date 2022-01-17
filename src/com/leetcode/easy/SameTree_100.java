package com.leetcode.easy;

public class SameTree_100 {

	public static void main(String[] args) {
		
	}
	
	// Recursion
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        
        if(p == null || q == null){
            return false;
        }
        
        if(p.val != q.val){
            return false;
        }
        
        
        boolean pBool = isSameTree(p.left, q.left); 
        boolean qBool = isSameTree(p.right, q.right);
        
        return pBool && qBool;
    }

}
