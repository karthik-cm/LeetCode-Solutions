package com.leetcode.easy;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReplaceElementsWithGreatestElementOnRightSide_1299 {

	public static void main(String[] args) {
		// int[] arr = {17, 18, 5, 4, 6, 1};
		int[] arr = {400};
		
		System.out.println(Arrays.toString(replaceElements(arr)));
	}
	
	
	public static int[] replaceElements(int[] arr) {
		int res[] = new int[arr.length];
		Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
		
		for(int i=0; i<arr.length; i++) {
			maxHeap.add(arr[i]);
		}
		
		for(int i=0; i<res.length-1; i++) {
			maxHeap.remove(arr[i]);
			res[i] = maxHeap.peek();
		}
		
		res[res.length-1] = -1;
		
		return res;
    }

}
