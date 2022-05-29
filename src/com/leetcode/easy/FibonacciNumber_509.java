package com.leetcode.easy;

import java.util.Arrays;

public class FibonacciNumber_509 {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(fib(n));
	}
	
	
	// Recursion
	// T.C = O(2^N)
	// S.C = O(N)
	/*public static int fib(int n) {
        if(n == 0 || n == 1) {
        	return n;
        }
        
        return fib(n - 1) + fib(n - 2);
    }*/

	
	
	// Bottom Up - Tabulation (small to big)
	// T.C = O(N)
	// S.C = O(N)
	public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
                  
        int[] cache = new int[n + 1];
        cache[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        
        System.out.println(Arrays.toString(cache));
    
        return cache[n];
    }
	
	
	
	
	// Top Down - Memoization (big to small)
	// T.C = O(N)
	// S.C = O(N)
	/*Map<Integer, Integer> map = new HashMap<>();
	    
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        
        if(map.containsKey(n)){
            return map.get(n);
        }
        else{
            int value = fib(n-1) + fib(n-2);
            map.put(n, value);
            return value;
        }
    }*/
	
}
