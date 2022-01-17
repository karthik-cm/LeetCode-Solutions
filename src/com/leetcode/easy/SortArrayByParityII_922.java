package com.leetcode.easy;

import java.util.Arrays;

public class SortArrayByParityII_922 {

	public static void main(String[] args) {
		int nums[] = {4,2,5,7};
		
		System.out.println(Arrays.toString(sortArrayByParityII(nums)));
	}
	
	public static int[] sortArrayByParityII(int[] nums) {
		int ans[] = new int[nums.length];
		
		int evenIndex = 0; // 0, 2, 4, 6 . . .
		int oddIndex = 1;  // 1, 3, 5, 7 . . .
		
		for(int n : nums) {
			if(n % 2 == 0) {
				ans[evenIndex] = n;
				evenIndex += 2;
			}
			else {
				ans[oddIndex] = n;
				oddIndex += 2; 
			}
		}
		
		return ans;
	}
	
	
	
	/*public static int[] sortArrayByParityII(int[] nums) {
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
		
		
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i=0; i<nums.length; i++) {
			if(i % 2 == 0) {
				nums[i] = even.get(evenIndex);
				evenIndex++;
			}
			else {
				nums[i] = odd.get(oddIndex);
				oddIndex++;
			}
		}
		
		return nums;		
    }*/

}
