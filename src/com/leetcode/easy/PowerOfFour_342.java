package com.leetcode.easy;

public class PowerOfFour_342 {

	public static void main(String[] args) {
		int n = 16;
		
		System.out.println(isPowerOfFour(n));
	}
	
	private static boolean isPowerOfFour(int n) {
        if(n == 0) {
        	return false;
        }
        
        if(n == 1) {
        	return true;
        }
        
        if(n % 4 == 0) {
        	return isPowerOfFour(n/4);
        }
        else {
        	return false;
        }
    }

}
