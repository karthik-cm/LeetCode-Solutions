package com.leetcode.medium;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class FindTheKthLargestIntegerInTheArray {

	public static void main(String[] args) {
		System.out.println();
	}
	
	
	// Min Heap
	public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();
        
        for(String numStr : nums) {
        	BigInteger num = new BigInteger(numStr);
        	minHeap.add(num);
        	
        	if(minHeap.size() > k) {
        		minHeap.poll();
        	}
        }
        
        return String.valueOf(minHeap.peek());
    }

}
