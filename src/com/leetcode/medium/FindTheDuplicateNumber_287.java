package com.leetcode.medium;

public class FindTheDuplicateNumber_287 {
	
	// Solution link : https://leetcode.com/problems/find-the-duplicate-number/solution/
	
	public static void main(String[] args) {
		int nums[] = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	
	
	// Naive Approaches #1 : Brute Force Approach (TLE)
	// Time Complexity = O(n^2)
	// Space Complexity = O(1)
	/*public static int findDuplicate(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				
				if((nums[i] ^ nums[j]) == 0) {
					return nums[i];
				}
			}
		}
		
		return -1;
    }*/
	
	
	
	// Naive Approaches #2 : Sort and Search
	// Time Complexity = O(nlogn)
	// Space Complexity = O(n)
	/*public static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				return nums[i];
			}
		}
		
		return -1;
    }*/
	
	
	// Naive Approaches #2 : Using Counting (Frequency Array)
	// Time Complexity = O(n)
	// Space Complexity = O(n)
	/*public static int findDuplicate(int[] nums) {
		int count[] = new int[nums.length];
		
		
		for(int num : nums) {
			if(count[num] <= 0) {
				count[num]++;
			}
			else {
				return num;
			}
		}

		return -1;
	}*/
	
	
	
	// Tortoise and Hare cycle detection
	// Time Complexity = O(n)
	// Space Complexity = O(1)
	public static int findDuplicate(int[] nums) {
		int tortoise = nums[0];
		int hare = nums[0];
		
		do{
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
		while (tortoise != hare);
		
		tortoise = nums[0];
		
		while(tortoise != hare) {
			tortoise = nums[tortoise];
			hare = nums[hare];
		}
		
		return tortoise;
	}
	
}
