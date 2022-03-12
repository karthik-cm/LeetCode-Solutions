package com.leetcode.medium;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		
		System.out.println(findKthLargest(nums, k));
	}
	
	
	// The idea is to init a heap "the smallest element first", 
	// and add all elements from the array into this heap one by one keeping the size of the heap always less or equal to k. 
	// That would results in a heap containing k largest elements of the array.
	// -> The head of this heap is the answer, i.e. the kth largest element of the array.
	
	
	// Min Heap - Similar to 1985. Find the Kth Largest Integer in the Array
	// TC - O(N logk)
	// SC - O(k)
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
