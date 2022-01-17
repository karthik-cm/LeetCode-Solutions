package com.leetcode.medium;

public class ContainerWithMostWater_11 {

	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7}; // 9
		System.out.println(maxArea(height));
	}
	
	
	// 1. Brute force approach
	// Time complexity - O(n^2)   [n*n-1/2]
	// Space complexity - O(1)
	public static int maxArea(int[] height, int[] height2) {
		int maxArea = 0, nextPairMaxArea = 0;
		
		for(int i=0; i<height.length; i++) {
			for(int j=i+1; j<height.length; j++) {
				nextPairMaxArea = Math.min(height[i], height[j]) * (j-i);
				maxArea = Math.max(maxArea, nextPairMaxArea);
			}
		}
		
		return maxArea;
	}
	
	
	
	// 2. Two pointer approach - i, j
	// Time complexity - O(n) - Single pass
	// Space complexity - O(1)
	public static int maxArea(int[] height) {
		int maxArea = 0, left = 0, right = height.length-1;
		
		while(left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			
			if(height[left] < height[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return maxArea;
    }
	
	
	
	
	
	
	/*public static int maxArea(int[] height) {
		int i = 0, j = height.length-1;
		int maxArea = Math.min(height[i], height[j]) * (j-i);

		while(i < j){
			if(height[i] <= height[j])
				i++;
			else 
				j--;
            
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
        }
        
        return maxArea;
    }*/

}
