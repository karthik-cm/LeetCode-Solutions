package com.leetcode.easy;

import java.util.Arrays;

public class CheckIfNandItsDoubleExist_1346 {

	public static void main(String[] args) {
		int[] arr = {10, 2, 5, 3};
		
		System.out.println(checkIfExist(arr));
	}
	
	
	public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            int M = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int N = arr[j];
                
                if(M > 0 && N > 0){
                    if(N == M*2){
                        return true;
                    }

                    if(N > M*2){
                        break;
                    }
                }
                else{
                    if(M == N*2){
                        return true;
                    }
                }
                
            }
        }
        
        return false;
    }

}
