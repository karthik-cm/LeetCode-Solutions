package com.leetcode.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens_51 {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(solveNQueens(n));
	}
	
	
	private static List<List<String>> result = new ArrayList<>();
	
	public static List<List<String>> solveNQueens(int n) {
        canPlaceQueens(new int[n][n], 0, new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
		return result;
    }
	
	
	private static void canPlaceQueens(int[][] board, int i, Set<Integer> diagonal, Set<Integer> diagonal2, Set<Integer> column) {
		if(i == board.length) {
			// Bounding function
			boardToList(board); // done go for final answer
			return;
		}
		
		for(int j=0; j<board.length; j++) {
			if(!diagonal.contains(i+j) && !diagonal2.contains(j-i) && !column.contains(j)) {
				board[i][j] = 1; // place the queen
				diagonal.add(i+j);
				diagonal2.add(j-i);
				column.add(j);
				
				canPlaceQueens(board, i+1, diagonal, diagonal2, column);
				
				board[i][j] = 0; // remove the placed queen
				diagonal.remove(i+j);
				diagonal2.remove(j-i);
				column.remove(j);
			}
		}
	}
	
	// converts board results to the list
	private static void boardToList(int[][] board) {
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<board.length; i++) {
			String str = "";
			
			for(int j=0; j<board.length; j++) {
				if(board[i][j] == 0) {
					str += ".";
				}
				else {
					str += "Q";
				}
			}
			
			list.add(str);
		}
		
		result.add(list);
	}

}