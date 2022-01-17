package com.leetcode.easy;

public class CanPlaceFlowers_605 {

	public static void main(String[] args) {
		int bed[] = {1, 0, 0, 0, 1};
		int n = 1;
		
		System.out.println(canPlaceFlowers(bed, n));
	}
	
	
	// Two Pointer Approach
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        
        for(int i=0; i<flowerbed.length; i++){
            int left = (i == 0) ? 0 : flowerbed[i-1];
            int right = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];
            
            if(left == 0 && right == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                counter++;
            }
        }
        
        return counter >= n;
    }

}
