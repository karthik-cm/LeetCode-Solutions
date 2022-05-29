package com.leetcode.easy;

import java.util.Arrays;

public class TwoSumII_167 {

	public static void main(String[] args) {
		int numbers[] = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

	
	public static int[] twoSum(int[] numbers, int target) {
		int low = 0;
        int high = numbers.length-1;
        
        while(low < high){
            int calTarget = numbers[low] + numbers[high];
            
            if(calTarget == target){
                return new int[] {low+1, high+1};
            }
            else if(calTarget > target){
                high--;
            }
            else{
                low++;
            }
        }
        
        return new int[] {1, 1};
    }
	
}
