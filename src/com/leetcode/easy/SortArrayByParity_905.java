package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity_905 {

	public static void main(String[] args) {
		int[] nums = {3,1,2,4};
		
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
	
	
	public static int[] sortArrayByParity(int[] nums) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		for(int n : nums) {
			if(n % 2 == 0) {
				even.add(n);
			}
			else {
				odd.add(n);
			}
		}
		
		// list.add 	- 	Primitives
		// list.addAll	-	Collections 
		even.addAll(odd);
		
		for(int i=0; i<even.size(); i++) {
			nums[i] = even.get(i);
		}
		
		return nums;
	}
	
	
	
	
	// LinkedList - push = head, offer = tail
	/*public static int[] sortArrayByParity(int[] nums) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int n : nums) {
			if(n % 2 == 0) {
				list.push(n); // head of the list
			}
			else {
				list.offer(n); // tail of the list
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = list.get(i);
		}
		
		return nums;
    }*/

}
