package com.leetcode.hard;

public class NumberOfDigitOne_233 {

	public static void main(String[] args) {
		
	}
	
	public int countDigitOne(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++){
            int temp = i;
            while(temp != 0){
                if(temp%10 == 1){
                    count++;
                }
                temp /= 10;
            }
        }
        
        return count;
    }

}
