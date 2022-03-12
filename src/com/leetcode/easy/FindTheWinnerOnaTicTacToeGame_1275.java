package com.leetcode.easy;

import java.util.Arrays;

public class FindTheWinnerOnaTicTacToeGame_1275 {

	public static void main(String[] args) {
		int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
		
		System.out.println(tictactoe(moves));
	}
	
	
	public static String tictactoe(int[][] moves) {
        char grid[][] = new char[3][3];
        
        boolean isAplays = true;
        int countOfAplays = 0;
        int countOfBplays = 0;
        
        for(int[] move : moves) {
        	int x = move[0];
        	int y = move[1];
        	
        	if(isAplays) {
        		grid[x][y] = 'X';
        		isAplays = false;
        		countOfAplays++;
        	}
        	else {
        		grid[x][y] = 'O';
        		isAplays = true;
        		countOfBplays++;
        	}
        }
        
        print(grid);
        
        
        if(checkIfaPlayerWins(grid, 'X')) {
        	return "A";
        }
        else if(checkIfaPlayerWins(grid, 'O')) {
        	return "B";
        }
        else if(countOfAplays + countOfBplays == 9){
        	return "Draw";
        }
        else {
        	return "Pending";
        }
    }
	
	private static boolean checkIfaPlayerWins(char[][] grid, char mark) {
		int m = grid.length;
		int n = grid[0].length;
		
		// check row wise
		for(int i=0; i<m; i++) {
			boolean row[] = new boolean[3]; 
			
			for(int j=0; j<n; j++) {
				if(grid[i][j] == mark) {
					row[j] = true;
				}
				else {
					break;
				}
			}
			
			if(row[0] && row[1] && row[2]) {
				return true;
			}
		}
		
		
		// check column wise
		for(int i=0; i<n; i++) {
			boolean col[] = new boolean[3];
			
			for(int j=0; j<m; j++) {
				if(grid[j][i] == mark) {
					col[j] = true;
				}
				else {
					break;
				}
			}
			
			if(col[0] && col[1] && col[2]) {
				return true;
			}
		}
		
		
		// check diagonals
		
		if(grid[0][0] == mark && grid[1][1] == mark && grid[2][2] == mark) { // diagonal
			return true;
		}
		else if(grid[0][2] == mark && grid[1][1] == mark && grid[2][0] == mark) { // anti-diagonal
			return true;
		}
		
		return false;
	}
	
	
	private static void print(char[][] matrix) {
		for(char[] arr : matrix) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
