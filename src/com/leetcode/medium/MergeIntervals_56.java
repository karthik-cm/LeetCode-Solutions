package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {

	public static void main(String[] args) {
		int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
		
		System.out.println(merge(intervals));
	}
	
	public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) {
			return intervals;
		}
		
		// Sort 2D array based on the first index - arr[0]
		Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		List<int[]> list = new ArrayList<>();
		int curr[] = intervals[0];
		list.add(curr);
		
		for(int[] next : intervals) {
			// int curr_begin = curr[0];
			int curr_end = curr[1];
			int next_begin = next[0];
			int next_end = next[1];
			
			if(curr_end >= next_begin) {
				curr[1] = Math.max(curr_end, next_end);
			}
			else {
				curr = next;
				list.add(curr);
			}
		}
		
		return list.toArray(new int[list.size()][]);
    }

}
