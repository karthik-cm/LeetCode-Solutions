package com.leetcode.easy;

public class PlaceFlowers {
	
	/*You have a long flowerbed in which some of the plots are planted, and some are not. 
	However, flowers cannot be planted in adjacent plots.

	Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
	and an integer n, 
	return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

	Example 1:

	Input: flowerbed = [1,0,0,0,1], n = 1
	Output: true
	Example 2:

	Input: flowerbed = [1,0,0,0,1], n = 2
	Output: false*/
	
	
	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,0,0,0,1};
		int n = 2;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	/*public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = -1, curr = -1, next = -1;
        int noOfFlowersPlaced = 0;
        
        for(int i=0; i<flowerbed.length; i++){
            prev = (i > 0) ? flowerbed[i-1] : -1;
        	curr = flowerbed[i];
            next = (i+1 < flowerbed.length) ? flowerbed[i+1] : -1;
            
            if(curr == 0){
            	if(prev == -1 && next == 0) {
            		 flowerbed[i+1] = 1;
                     curr = 1;
                     noOfFlowersPlaced++;
            	}
            }
            else {
            	if(next == 1)
            		noOfFlowersPlaced--;
            }
        }
        
        System.out.println(Arrays.toString(flowerbed));
        System.out.println("n="+n);
        
        if(noOfFlowersPlaced == n){
            return true;
        }else{
            return false;
        }
    }*/
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int i = 0, count = 0;
	        while (i < flowerbed.length) {
	            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && 
	            		(i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
	                flowerbed[i] = 1;
	                count++;
	            }
	            i++;
	        }
	        return count >= n;
	    }

}
