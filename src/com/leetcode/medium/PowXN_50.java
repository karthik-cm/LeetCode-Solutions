package com.leetcode.medium;

public class PowXN_50 {

	public static void main(String[] args) {
		
	}
	
	
	public double myPow(double x, int n) {
        return calPow(x, n);
    }
    
    private double calPow(double x, long n){
        if(n == 0) 
            return 1.0;
        
        if(n == 1)
            return x;
        
        if(n < 0)
            return calPow(1/x, -n);

        if(n % 2 == 0){
            double result = calPow(x, n/2);
            return result * result;
        }
        else{ 
            return x * calPow(x, n-1);
        }
    }

}
