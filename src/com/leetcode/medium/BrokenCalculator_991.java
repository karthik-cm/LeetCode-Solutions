package com.leetcode.medium;

public class BrokenCalculator_991 {

	// Algorithm : Work Backwards
	// While Y is larger than X, add 1 if it is odd, else divide by 2. 
	// After, we need to do X - Y additions to reach X.
	
	public static void main(String[] args) {
		int x = 2, y = 3;
		
		System.out.println(brokenCalc(x, y));
	}
	
	public static int brokenCalc(int x, int y) {
		int count = 0;
		
		while(y > x) {
			count++;
			
			if(y%2 == 0) {
				y /= 2;
			}
			else {
				y++;
			}
		}
		
		return count + x - y;
    }

}
