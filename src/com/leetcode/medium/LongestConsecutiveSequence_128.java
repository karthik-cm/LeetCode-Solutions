package com.leetcode.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LongestConsecutiveSequence_128 {

	public static void main(String[] args) {
		// int count[] = {1, 2, 1, 1, 0, 0, 1, 1, 1, 1, 1};
		// int nums[] = {-2, 100, -3, 0, 4, 200, 1, 3, 2, -1};
		
		int nums[] = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(nums));
	}
	
	
	
	public static int longestConsecutive(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		
		
		int ans = 0;
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		Set<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			if(!set.contains(num)) {
				set.add(num);
				minHeap.add(num);
			}
		}
		
		
		int local = 0;
		
		int curr = minHeap.poll();
		while(minHeap.size() > 0) {
			int next = minHeap.poll();
			int diff = Math.abs(next - curr);
			
			if(diff == 1) {
				local++;
			}
			else {
				ans = Math.max(ans, local);
				local = 0;
			}
			
			curr = next;
		}
		
		ans = Math.max(ans, local);
		
        return ans+1;
    }

}
