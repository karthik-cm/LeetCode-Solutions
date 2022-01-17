package com.leetcode.easy;

import java.util.Arrays;

public class PlusOne_66 {

	public static void main(String[] args) {
		int digits[] = {9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	
	public static int[] plusOne(int[] digits) {
		int carry = 1;
		
	    for(int i=digits.length-1; i>= 0; i--) {
	        digits[i] += carry; // max_value of digits[i] can be 10
	        
	        if (digits[i] <= 9) { // early return 
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] ans = new int[digits.length+1]; // ex: 99+1
	    ans[0] = 1;
	    return ans;
    }
	
	
	
	
	
	
	
	
	/*public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                if(i == 0){
                    int[] resultArray = new int[digits.length + 1];
                    resultArray[0] = 1;
                    return resultArray;
                }
                else{
                    digits[i] = 0;
                }
            }
            else{
                digits[i]++;
                break;
            }
        }

        return digits;
    }*/
	
}
