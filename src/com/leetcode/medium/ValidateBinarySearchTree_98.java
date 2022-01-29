package com.leetcode.medium;

import java.util.ArrayList;

public class ValidateBinarySearchTree_98 {

	public static void main(String[] args) {

	}
	
	
	public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        
        inorderTraversal(root, list);
        
        return checkIfListIsSorted(list);
    }
    
    private void inorderTraversal(TreeNode root, ArrayList<Integer> list){  
        if(root == null){
            return;
        }
        
        if(root.left != null){
            inorderTraversal(root.left, list);
        }
        
        list.add(root.val);
        
        if(root.right != null){
            inorderTraversal(root.right, list);
        }
    }
    
    private boolean checkIfListIsSorted(ArrayList<Integer> list){
        if(list.size() == 0){
            return true;
        }
        
        for(int i=1; i<list.size(); i++){
            if(list.get(i) <= list.get(i-1)){
                return false;
            }
        }
        
        return true;
    }

}
