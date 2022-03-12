package com.leetcode.easy;

import java.util.Arrays;

public class MeetingRooms_252 {

	public static void main(String[] args) {
		int[][] intervals = {{0,30}, {60,240}, {90,120}};
		
		System.out.println(canAttendMeetings(intervals));
	}
	
	
	// Time Complexity : O(n log n)
	// Space COmplexity : O(1)
	public static boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length <= 1) {
        	return true;
        }
		
        // Sorts the intervals in ascending order based on the start value
		Arrays.sort(intervals, (arr1, arr2) -> (Integer.compare(arr1[0], arr2[0])));
        
        int[] curr = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
        	int[] next = intervals[i];
        	
        	if(curr[1] > next[0]) {
        		// overlapping interval - a person cannot attend both the meetings here
        		return false;
        	}
        	
        	curr = next;
        }
        
        return true;
    }

}
