package com.leetcode.medium;

import java.util.ArrayList;

public class BinarySearchIterator_173 {
	
	public static void main(String[] args) {
		
	}
	
	
	// T.C = O(N)
	// S.C = O(N)
	ArrayList<Integer> list = new ArrayList<>();
    int index = 1;
    
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    

    public BinarySearchIterator_173(TreeNode root) {
        list.add(-1);
        inorder(root, list);
    }
    
    public int next() {
        int nextElement = list.get(index);
        index++;
        return nextElement;
    }
    
    public boolean hasNext() {
        return index < list.size();
    }
}
