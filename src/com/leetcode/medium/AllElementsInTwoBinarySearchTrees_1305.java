package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AllElementsInTwoBinarySearchTrees_1305 {
	
	public static void main(String[] args) {
		
	}
	
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        dfs(root1, minHeap);
        dfs(root2, minHeap);
        
        List<Integer> result = new ArrayList<>();
        while(minHeap.size() > 0){
            result.add(minHeap.poll());
        }
        
        return result;
    }
    
    private static void dfs(TreeNode root, PriorityQueue<Integer> minHeap){
        if(root == null){
            return;
        }
        
        if(root.left != null){
            dfs(root.left, minHeap);
        }
        
        if(root.right != null){
            dfs(root.right, minHeap);
        }
        
        minHeap.add(root.val);
    }
}
