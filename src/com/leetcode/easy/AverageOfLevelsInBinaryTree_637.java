package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevelsInBinaryTree_637 {

	public static void main(String[] args) {
		
	}
	
	
	// BFS
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(queue.size() > 0) {
        	int size = queue.size();
        	
        	double total = 0;
        	double count = size;
        	
        	while(size > 0) {
        		TreeNode node = queue.poll();
        		
        		if(node.left != null) {
        			queue.add(node.left);
        		}
        		
        		if(node.right != null) {
        			queue.add(node.right);
        		}
        		
        		total += node.val;
        		
        		size--;
        	}
        	
        	list.add(total/count);
        }
        
        return list;
    }

}
