package com.leetcode.easy;

import java.util.Arrays;

public class MaximumWealth {

	public static void main(String[] args) {
		
	}
	
	public static int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int i=0; i<accounts.length; i++){
            int arrSum = Arrays.stream(accounts[i]).sum();
            
            if(max < arrSum){
                 max = arrSum;
            }
        }
        
        return max;
    }

}
