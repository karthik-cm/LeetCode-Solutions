package com.leetcode.easy;

public class ValidPerfectSquare_367 {

	public static void main(String[] args) {
		int num = 25;
		System.out.println(isPerfectSquare(num));
	}
	
	
	// Binary Search Approach
	public static boolean isPerfectSquare(int num) {
		if(num < 1) {
			return false;
		}
		
		long low = 1;
		long high = num;
		
		while(low <= high) {
			long mid = low + (high - low) / 2;
			
			long sq = mid * mid;
			
			if(sq == num) {
				return true;
			}
			else if(sq < num) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return false;
	}

}
