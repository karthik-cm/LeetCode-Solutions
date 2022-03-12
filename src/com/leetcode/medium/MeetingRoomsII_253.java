package com.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII_253 {

	public static void main(String[] args) {
		
	}
	
	
	// Time Complexity : O(n log n)
	// Space Complexity : O(n)
	public static int minMeetingRooms(int[][] intervals) {
		if (intervals.length == 0) {
			return 0;
		}

		
		// Sort the intervals by start time
		Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		
		// Min heap to store the end time of each meeting
		PriorityQueue<Integer> allocator = new PriorityQueue<>();


		// Add the end time of first meeting
		allocator.add(intervals[0][1]);

		// Iterate over remaining intervals
		for (int i = 1; i < intervals.length; i++) {

			// If the room due to free up the earliest is free, assign that room to this meeting.
			if (intervals[i][0] >= allocator.peek()) {
				allocator.poll();
			}

			// If a new room is to be assigned, then also we add to the heap,
			// If an old room is allocated, then also we have to add to the heap with updated end time.
			allocator.add(intervals[i][1]);
		}

		// The size of the heap tells us the minimum rooms required for all the meetings.
		return allocator.size();
	}

}
