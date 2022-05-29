package com.leetcode.medium;

public class ContainerWithMostWater_11 {

	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7}; // 9
		System.out.println(maxArea(height));
	}
	
	
	// 1. Brute force approach
	// Time complexity - O(n^2)   [n*n-1/2]
	// Space complexity - O(1)
	/*public static int maxArea(int[] height) {
		int maxArea = 0;
		
		for(int i = 0; i < height.length; i++) {
			for(int j = i+1; j < height.length; j++) {
				maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
			}
		}
		
		return maxArea;
	}*/
	
	
	
	// 2. Two pointer approach (Single pass)
	// Time complexity - O(n)
	// Space complexity - O(1)
	public static int maxArea(int[] height) {
		int maxArea = 0;
		
		int left = 0;
		int right = height.length - 1;
		
		while(left < right) {
			int shorterLine = Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, shorterLine * (right - left));
			
			if(shorterLine == height[left]) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return maxArea;
	}
	
	
}
