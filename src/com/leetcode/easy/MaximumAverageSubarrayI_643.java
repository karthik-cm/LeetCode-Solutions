package com.leetcode.easy;

public class MaximumAverageSubarrayI_643 {

	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		
		// int[] nums = {-1};
		// int k = 1;
		
		System.out.println(findMaxAverage(nums, k));
	}
	
	public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        
        int max = sum;
        int left = 0, right = k;
        
        for(int i=0; i<nums.length-k; i++){
            sum += (nums[right] - nums[left]);
            right++;
            left++;
            
            if(sum > max) {
            	max = sum;
            }
        }
        
        return (double) max/k;
    }
	
	
	/*public static double findMaxAverage(int[] nums, int k) {
		double avg = 0;
		double mainsum = Integer.MIN_VALUE;
		
		int left = 0;
		int right = nums.length-k;
		
		while(left <= right) {
			int sum = findSum(left, k, nums);
			
			if(sum > mainsum) {
				mainsum = sum;
			}
			
			left++;
		}
		
		avg = (double) (mainsum/k);
		
		return avg;
    }


	private static int findSum(int left, int k, int[] nums) {
		int sum = 0;
		
		int l = left;
		int r = left+k-1;
		
		while(l <= r) {
			sum += nums[l] + nums[r];
			
			if(l == r) {
				sum -= nums[l];
			}
			
			l++;
			r--;
		}
		
		return sum;
	}*/

}
