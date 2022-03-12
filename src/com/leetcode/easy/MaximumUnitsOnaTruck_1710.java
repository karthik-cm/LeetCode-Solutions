package com.leetcode.easy;

import java.util.Arrays;

public class MaximumUnitsOnaTruck_1710 {

	public static void main(String[] args) {
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize = 10;
		
		System.out.println(maximumUnits(boxTypes, truckSize));
	}
	
	
	// Time Complexity : O(nlogn)
	// Space Complexity: O(1)
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		
		// Sort the boxTypes 2D array based on the number of units per boxes in a decreasing order -> Takes O(nlogn)
		Arrays.sort(boxTypes, (a,b) -> (b[1] - a[1]));
        // print(boxTypes);
        
        int maxUnits = 0;
        
        for(int[] boxType : boxTypes) {
        	int boxCount = Math.min(truckSize, boxType[0]);
        	
        	maxUnits += boxCount * boxType[1];
        	truckSize -= boxCount;
        	
        	if(truckSize == 0) {
        		break;
        	}
        }
        
        return maxUnits;
    }


	public static void print(int[][] boxTypes) {
		for(int[] arr : boxTypes) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
