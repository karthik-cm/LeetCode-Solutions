package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 2, 1};
		int nums2[] = {2, 2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	
	// Two Sets
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int n1 : nums1) {
        	set1.add(n1);
        }
        
        for(int n2 : nums2) {
        	set2.add(n2);
        }
        
        set1.retainAll(set2);
        
        int arr[] = new int[set1.size()];
        int index = 0;
        
        for(int i : set1) {
        	arr[index++] = i;
        }
        
        return arr;
    }

}
