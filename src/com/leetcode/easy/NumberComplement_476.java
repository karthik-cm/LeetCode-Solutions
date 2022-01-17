package com.leetcode.easy;

public class NumberComplement_476 {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println(findComplement(num));
	}
	
	
	public static int findComplement(int num) {
		String binaryNumStr = Integer.toBinaryString(num);
		
		String binaryNumStrComp = "";
		for(char c : binaryNumStr.toCharArray()) {
			if(c == '1') {
				binaryNumStrComp += "0";
			}
			else {
				binaryNumStrComp += "1";
			}
		}
		
		return Integer.parseInt(binaryNumStrComp, 2);
    }

}
