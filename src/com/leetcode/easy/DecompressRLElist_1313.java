package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist_1313 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println(decompressRLElist(nums));
	}
	
	public static int[] decompressRLElist(int[] nums) {
        List<Integer> listArr = new ArrayList<>();
        
        for(int i=0; i<nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            
            listArr = add(listArr, freq, val);
        }
        
        int newArr[] = new int[listArr.size()];
        int index = 0;
        
        for(Object o : listArr.toArray()) {
        	newArr[index] = (int) o;
        	index++;
        }
        
        return newArr;
    }
    
    public static List<Integer> add(List<Integer> listArr, int freq, int val){
        for(int i=0; i<freq; i++){
        	listArr.add(val);
        }
        return listArr;
    }

}
