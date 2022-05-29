package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shift2DGrid_1260 {

	public static void main(String[] args) {
		int[][] grid = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		int k = 1;
		
		shiftGrid(grid, k);
	}
	
	
	
	public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        int m = grid.length;
        int n = grid[0].length;
        
        while(k > 0) {
        	LinkedList<Integer> lastCol = getLastColumn(m, n, grid);
        	
        	for(int i = 0; i < m; i++) {
        		for(int j = n - 1; j > 0 ; j--) {
            		grid[i][j] = grid[i][j-1];
            	}
        	}
        	
        	for(int i = 0; i < m; i++) {
        		grid[i][0] = lastCol.get(i);
        	}
        	
        	k--;
        }
        
        
        for(int i = 0; i < m; i++) {
    		List<Integer> row = new ArrayList<>();
    		
        	for(int j = 0; j < n ; j++) {
        		row.add(grid[i][j]);
        	}
        	
        	result.add(row);
    	}
        
        System.out.println(result);
        
        return result;
    }



	private static LinkedList<Integer> getLastColumn(int m, int n, int[][] grid) {
		LinkedList<Integer> lastCol = new LinkedList<>();
		
		for(int i = 0; i < m; i++) {
			lastCol.add(grid[i][n-1]);
		}
		
		int lastVal = lastCol.removeLast();
		lastCol.addFirst(lastVal);
		
		return lastCol;
	}
}
