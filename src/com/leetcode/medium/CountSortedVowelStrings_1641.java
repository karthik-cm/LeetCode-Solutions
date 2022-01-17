package com.leetcode.medium;

public class CountSortedVowelStrings_1641 {

	public static void main(String[] args) {
		
	}
	
	
	public static int countVowelStrings(int n) {
        int arr[][] = new int[n+1][6];
        for(int i=1; i<=5; i++) {
            arr[1][i] = i;
        }
        
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=5; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[n][5];
    }

}
