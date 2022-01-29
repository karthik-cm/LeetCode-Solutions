package com.leetcode.medium;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {

	public static void main(String[] args) {
		
	}
	
	
	// Min Heap - Similar to 1985. Find the Kth Largest Integer in the Array
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min Heap
	    
	    for(int num : nums) {
	    	minHeap.add(num);
	    	
	    	if(minHeap.size() > k) {
	    		minHeap.poll();
	    	}
	    }
	    
	    return minHeap.peek();
	}
	
	
	// Basic
	/*public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
		return nums[nums.length-k];
    }*/
}
