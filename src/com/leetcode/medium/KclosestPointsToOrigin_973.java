package com.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KclosestPointsToOrigin_973 {

	public static void main(String[] args) {
		int[][] points = {
			{1, 3}, 
			{-2, 2}
		};
		
		int k = 1;
		
		kClosest(points, k);
	}
	
	
	public static int[][] kClosest(int[][] points, int k) {
        if(points.length == k) {
        	return points;
        }
		
        // Stores the points in the descending order of the distance from the origin
		PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
		
		for(int[] point : points) {
			maxHeap.add(point);
			
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		
		int[][] result = new int[k][2];
		int index = 0;
		
		while(k-- > 0) {
			result[index++] = maxHeap.poll();
		}
		
		print(result);
		
		return result;
    }


	private static void print(int[][] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}
	
	
	
}
