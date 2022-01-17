package com.leetcode.medium;

public class MultiplyStrings_43 {

	// Medium 43
	
	public static void main(String[] args) {
		String num1 = "999999999999999999";
		String num2 = "456456456456456456";
		
		System.out.println(num1.length());		
		System.out.println(multiply(num1, num2));
	}
	
	public static String multiply(String num1, String num2) {
        String res = "";
        
		if(num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty()) {
			int len1 = num1.length();
			int len2 = num2.length();
			
			// 123  456
			
			for(int i=len1-1; i>=0; i--) {
				for(int j=len2-1; j>=0; j--) {
					
				}
			}
			
        }
		
		return res;
    }

}
