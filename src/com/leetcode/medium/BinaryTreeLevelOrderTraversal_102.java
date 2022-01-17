package com.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_102 {

	public static void main(String[] args) {
		
	}
	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		
		if(root == null) {
			return list;
		}
		
		// Queue<TreeNode> queue = new PriorityQueue<>(); // This cannot be used as it handles only int type - Min Heap
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(queue.size() > 0) {
			int size = queue.size();
			List<Integer> sublist = new ArrayList<>();
			
			while(size != 0) {
				TreeNode node = queue.poll();
				sublist.add(node.val);
				
				if(node.left != null) {
					queue.add(node.left);
				}
				
				if(node.right != null) {
					queue.add(node.right);
				}
				
				size--;
			}
			
			list.add(sublist);
		}
		
		return list;
    }

}
