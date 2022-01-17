package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray_442 {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		
		System.out.println(findDuplicates(nums));
	}
	
	
	// Time - O(n), Space - O(1)
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++) {
			int num = Math.abs(nums[i]);
			int index = num - 1;
			
			if(nums[index] < 0) {
				list.add(num);
			}
			
			nums[index] = -nums[index];
		}
		
		return list;
	}
	
	
	// Time - O(nlogn), Space - O(1)
	/*public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
        int prev = -1;
        
        for(int n : nums){
        	if(n == prev) {
        		list.add(n);
        	}
        	
        	prev = n;
        }
        
        return list;
    }*/
	
	
	/*public List<Integer> findDuplicates(int[] nums) {
	    LinkedList<Integer> list = new LinkedList<>();
	    HashSet<Integer> set = new HashSet<>();
	    
	    for(int n : nums){
	        if(set.contains(n)){
	            list.add(n);
	        }
	        else{
	            set.add(n);
	        }
	    }
	    
	    return list;
	}*/

}
