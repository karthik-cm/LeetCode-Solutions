package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReduceArraySizeToHalf_1338 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(minSetSize(arr));
	}
	
	
	public static int minSetSize(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list, Collections.reverseOrder());
		
		int rem = arr.length / 2, index = 0;
		
		for(int i=0; i<arr.length && rem > 0; i++) {
			rem -= list.get(i);
			index++;
		}
		
		return index;
    }

}
