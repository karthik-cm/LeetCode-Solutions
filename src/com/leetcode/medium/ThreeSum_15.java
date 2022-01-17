package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15 {

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3) {
        	return new ArrayList<>(set);
        }
        
        Arrays.sort(nums);
        
        // [-1,0,1,2,-1,-4]
        // [-4,-1,-1,0,1,2]
        
        for(int i=0; i<nums.length-1; i++){
           int low = i+1;
           int high = nums.length-1;
           
           while(low < high){
        	   int sum = nums[i] + nums[low] + nums[high];
        	   
               if(sum == 0) {
            	   set.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
               }
               else if(sum > 0) {
            	   high--;
               }
               else if(sum < 0) {
            	   low++;
               }
            }
        }
        
        return new ArrayList<>(set);
    }

}







/*class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> currList = null;
        
        for(int i=0; i<nums.length; i++){
           for(int j=i+1; j<nums.length; j++){
              for(int k=j+1; k<nums.length; k++){
                 
                 if(nums[i] + nums[j] + nums[k] == 0){
                	currList = new ArrayList<Integer>();
                	 
                    currList.add(nums[i]);
                    currList.add(nums[j]);
                    currList.add(nums[k]);
                    
                    boolean isNewList = compareListIntAndList(finalList, currList);
                    
                    if(isNewList){
                        finalList.add(currList);   
                    }
                 }
              } 
           } 
        }
        
        return finalList;
    }
    
    public static boolean compareListIntAndList(List<List<Integer>> finalList, List<Integer> intList){
		boolean isNewList = true;
		
        if(finalList.size() >= 1){
            List<Integer> currFinalList = new ArrayList<>();
		
            for(int i=0; i<finalList.size(); i++){
                currFinalList = finalList.get(i);

                Collections.sort(currFinalList);
                Collections.sort(intList);

                if(currFinalList.equals(intList)){
                    isNewList = false;
                }
            }
        }
        else{
            isNewList = true;
        }
        
        return isNewList;
    }
}*/