package com.leetcode.medium;

import java.util.LinkedList;

public class FindWinnerOfCircularGame_1823 {

	public static void main(String[] args) {
		int n = 5, k = 2;
		// 1 2 3 4 5 - 2
		// 1 3 4 5 - 4
		// 1 3 5 - 1
		// 3 5 - 5
		// 3
		
		System.out.println(findTheWinner(n, k));
	}
	
	public static int findTheWinner(int n, int k) {
		if(n == 1){
			return 1;
	    }
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		int index = 0;
		while(list.size() > 1) {
			index = (index + k-1) % list.size(); 
			list.remove(index);
		}
		
		return list.get(0);
	}

}
