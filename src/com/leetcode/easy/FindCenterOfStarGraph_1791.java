package com.leetcode.easy;

public class FindCenterOfStarGraph_1791 {

	public static void main(String[] args) {
		int[][] edges = {
			{1,2}, {2,3}, {4,2}
		};
		
		System.out.println(findCenter(edges));
	}
	
	
	public static int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];
        
        if(first[0] == second[0] || first[0] == second[1]){
            return first[0];
        }
        else{
            return first[1];
        }
    }

}
