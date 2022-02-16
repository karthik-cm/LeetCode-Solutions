package com.leetcode.easy;

public class AddDigits_258 {

	public static void main(String[] args) {
		int num = 12345;
		
		System.out.println(addDigits(num));
	}
	
	
	// Digital Root - Sum of all the individual numbers in a Number
	public static int addDigits(int num) {
		int digitalRoot = 0;
		
		while(num > 0) {
			digitalRoot += num % 10;
			num = num / 10;
			
			if(num == 0 && digitalRoot > 9) {
				num = digitalRoot;
				digitalRoot = 0;
			}
		}
		
		return digitalRoot;
    }

}
