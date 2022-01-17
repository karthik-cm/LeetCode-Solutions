package com.leetcode.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LastStoneWeight_1046 {

	public static void main(String[] args) {
		int stones[] = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));
	}
	
	public static int lastStoneWeight(int[] stones) {
		List<Integer> list = new LinkedList<>();
		
		for(int s : stones) {
			list.add(s);
		}
		
		Collections.sort(list);
		
		return solve(list);
    }

	private static int solve(List<Integer> list) {
		if(list.size() == 1) {
			return list.get(0);
		}
		
		int size = list.size();
		int lastElement = list.get(size-1);
		int secondLastElement = list.get(size-2);
		
		if((secondLastElement == lastElement) && (size == 2)) {
			return 0;
		}
		
		list.remove(size-1);
		list.remove(size-2);
		
		if(secondLastElement < lastElement){
			list.add(lastElement - secondLastElement);
		}
		
		Collections.sort(list);
		
		return solve(list);
	}	

}