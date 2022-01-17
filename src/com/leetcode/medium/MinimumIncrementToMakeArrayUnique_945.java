package com.leetcode.medium;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MinimumIncrementToMakeArrayUnique_945 {

	public static void main(String[] args) {
		int nums[] = {3,2,1,2,1,7};
		System.out.println(minIncrementForUnique(nums));
	}
	
	public static int minIncrementForUnique(int[] nums) {
        int[] count = new int[100000];
        for(int x : nums)
        	count[x]++;

        int ans = 0, taken = 0;

        for(int x=0; x<100000; ++x) {
            if(count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            }
            else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
            }
        }

        return ans;
    }
	
	
	public static int minIncrementForUnique(int[] nums, int nums2[]) {
		int count = 0;
		Arrays.sort(nums);
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i : nums) {
			if(!set.contains(i)) {
				set.add(i);
			}
			else {
				int num = i;
				while(true) {
					num++;
					count++;
					
					if(!set.contains(num)) {
						set.add(num);
						break;
					}
				}
			}
		}
		
		return count;
    }

}
