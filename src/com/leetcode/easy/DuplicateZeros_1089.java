package com.leetcode.easy;

import java.util.Arrays;

public class DuplicateZeros_1089 {

	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,5,0};
		// int arr[] = {0,4,1,0,0,8,0,0,3};
		
		duplicateZeros(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void duplicateZeros(int[] arr) {
        if(arr == null || arr.length == 0) return;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                
            	for(int j=arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                
                i++;
            }
        }
    }
	
	
	
	
	/*public static void duplicateZeros(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				List<Integer> list = getArrayDetails(arr, i+1);
				
				if(i+1 < arr.length) {
					arr[i+1] = 0;
				}

				modifyArray(i+2, arr, list);
				
				i = i+1;
			}
		}
    }


	private static List<Integer> getArrayDetails(int[] arr, int i) {
		List<Integer> list = new ArrayList<>();
		
		for( ;i<arr.length-1; i++) {
			list.add(arr[i]);
		}
		
		return list;
	}
	
	
	private static void modifyArray(int i, int[] arr, List<Integer> list) {
		int index = 0;
		for( ;i<arr.length; i++) {
			arr[i] = list.get(index);
			index++;
		}
	}*/

}
