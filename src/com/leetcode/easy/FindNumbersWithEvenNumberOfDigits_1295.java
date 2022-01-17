package com.leetcode.easy;

public class FindNumbersWithEvenNumberOfDigits_1295 {

	public static void main(String[] args) {
		int nums[] = {12, 345, 2, 6, 7896};
		
		System.out.println(findNumbers(nums));
	}
	
	public static int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for(int n : nums){
            String numStr = String.valueOf(n);
            
            if(numStr.length() % 2 == 0){
                evenCount++;
            }
        }
        
        return evenCount;
    }

}
