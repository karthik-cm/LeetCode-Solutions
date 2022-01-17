package com.leetcode.easy;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		String strs[] = {"flower", "flow", "flight"};
		
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0) return "";
	    
	    return longestCommonPrefix(strs, 0, strs.length - 1);
	}

	private static String longestCommonPrefix(String[] strs, int l, int r) {
	    if(l == r) {
	        return strs[l];
	    }
	    else {
	        int mid = (l + r)/2;
	        String lcpLeft = longestCommonPrefix(strs, l , mid);
	        String lcpRight = longestCommonPrefix(strs, mid+1, r);
	        return commonPrefix(lcpLeft, lcpRight);
	   }
	}

	public static String commonPrefix(String left,String right) {
	    int min = Math.min(left.length(), right.length());       
	    for(int i=0; i<min; i++) {
	        if(left.charAt(i) != right.charAt(i)) {
	            return left.substring(0, i);
	        }
	    }
	    return left.substring(0, min);
	}

}
