package com.leetcode.medium;

public class KthSymbolInGrammar_779 {

	public static void main(String[] args) {
		int n = 2;
		int k = 2;
		System.out.println(kthGrammar(n, k));
		
		
		// Pattern
		// 0
		// 01
		// 0110
		// 01101001
	}
	
	public static int kthGrammar(int n, int k) {
        if(n == 1 && k == 1){
            return 0;
        }
        
        int mid = (int) Math.pow(2, n-1) / 2;
        
        if(k <= mid){
        	// map to previous level of n
            return kthGrammar(n-1, k);
        }
        else{
        	// reduce the k value, map to previous level of n, invert it
            return (kthGrammar(n-1, k-mid) == 0) ? 1 : 0;
        }
    }

}
