package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

	public static void main(String[] args) {
		// [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
		
		int[] arr = {1,2,3};
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			list.add(i);
		}
		
		System.out.println(list);
	}
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
		
        List<Integer> prev = new ArrayList<>();
		int[] arr = new int[0];
        
        for(int i=0; i<numRows; i++) {
        	prev = new ArrayList<>();
        	arr = new int[i+1];
        	int j=0;
        	
        	while(j<=i) {
        		for(j=0; j<arr.length; j++) {
        			if(j == 0 || j == arr.length-1) {
        				arr[j] = 1;
        			}
        			else {
        				
        			}
        			j++;
        		}
        		
        		for(int k : arr) {
        			prev.add(k);
        		}
        		
        		list.add(prev);
        	}
        }
		
		return list;
    }

}
