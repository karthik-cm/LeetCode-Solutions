package com.leetcode.easy;

public class PowerOfTwo_231 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(isPowerOfTwo(n));
	}
	
	public static boolean isPowerOfTwo(int n) {
		// 2 - Terminating condition / Base condition
		if(n == 0){
            return false;
        }
		
		if(n == 1) {
			return true;
		}
		
		// Head Recursion
		if(n % 2 == 0) {
			return isPowerOfTwo(n/2);
		}
		else {
			return false;
		}
    }

}
