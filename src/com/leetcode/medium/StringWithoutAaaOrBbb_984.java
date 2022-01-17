package com.leetcode.medium;

public class StringWithoutAaaOrBbb_984 {

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println(strWithout3a3b(a, b));
	}
	
	public static String strWithout3a3b(int a, int b) {
		int aCount = 0;
		int bCount = 0;
		int n = a + b;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			if(a >= b && aCount < 2 || bCount == 2 && a > 0) {
				sb.append('a');
				a--;
				aCount++;
				bCount = 0;
			}
			else if(b >= a && bCount < 2 || aCount == 2 && b > 0) {
				sb.append('b');
				b--;
				bCount++;
				aCount = 0;
			}
		}
		
		
		return sb.toString();
	}

}
