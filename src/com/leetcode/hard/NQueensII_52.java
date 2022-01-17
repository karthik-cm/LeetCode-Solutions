package com.leetcode.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueensII_52 {
	
	private static List<List<String>> result = new ArrayList<>();
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solveNQueens(n));
	}
	
	
	public static int solveNQueens(int n) {
        canPlaceQueens(new int[n][n], 0, new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>());
		return result.size();
    }
	
	
	private static void canPlaceQueens(int[][] board, int i, Set<Integer> diagonal, Set<Integer> diagonal2, Set<Integer> column) {
		if(i == board.length) {
			// Bounding function
			boardToList(board); // add it to the result list
			return;
		}
		
		for(int j=0; j<board.length; j++) {
			if(!diagonal.contains(i+j) && !diagonal2.contains(j-i) && !column.contains(j)) {
				board[i][j] = 1;
				diagonal.add(i+j);
				diagonal2.add(j-i);
				column.add(j);
				
				canPlaceQueens(board, i+1, diagonal, diagonal2, column);
				
				board[i][j] = 0;
				diagonal.remove(i+j);
				diagonal2.remove(j-i);
				column.remove(j);
			}
		}
	}
	
	// converts board results to the list
	private static void boardToList(int[][] board) {
		/*for(int i=0; i<board.length; i++) {
			System.out.println(Arrays.toString(board[i]));
		}*/
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
