package com.leetcode.easy;

import java.util.Arrays;

public class CheckIfOneStringSwapCanMakeStringsEqual_1790 {

	public static void main(String[] args) {
		
	}
	
	
	public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        int counter = 0;
        
        for(int i = 0; i<s1.length(); i++){
           char c1 = s1.charAt(i);
           char c2 = s2.charAt(i);
           
           if(c1 != c2) {
              counter++;
           }
           
           // Utmost one String swap is only possible
           if(counter > 2) {
              return false;
           }
           
           s1Arr[c1-'a']++;
           s2Arr[c2-'a']++;
        }
        
        return Arrays.equals(s1Arr, s2Arr);
    }

}
