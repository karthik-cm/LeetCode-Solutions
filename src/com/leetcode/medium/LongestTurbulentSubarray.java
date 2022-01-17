package com.leetcode.medium;

public class LongestTurbulentSubarray {

	public static void main(String[] args) {
		int arr[] = {4,8,12,16};
		System.out.println(maxTurbulenceSize(arr));
		
		System.out.println(Integer.compare(6, 12));
	}
	
	
	public static int maxTurbulenceSize(int[] arr) {
		int len = arr.length;
		int ans = 1;
		int anchor = 0;

		for(int i=1; i<len; ++i) {
			int c = Integer.compare(arr[i-1], arr[i]); // compare adjacent int
			if (c == 0) {
			    anchor = i;
			} 
			else if (i == len-1 || c * Integer.compare(arr[i], arr[i+1]) != -1) {
			    ans = Math.max(ans, i - anchor + 1);
			    anchor = i;
			}
		}

		return ans;
    }

}
