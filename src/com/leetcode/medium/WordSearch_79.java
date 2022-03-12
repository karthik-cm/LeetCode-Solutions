package com.leetcode.medium;

public class WordSearch_79 {

	public static void main(String[] args) {
		char[][] board = {
			{'A', 'B', 'C', 'E'},
			{'S', 'F', 'C', 'S'},
			{'A', 'D', 'E', 'E'}
		};
		
		String word = "ABCCEX";
		
		System.out.println(exist(board, word));
	}
	
	
	// DFS
	// TC - O(m.n)
	// SC - O(m.n)
	public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
					return true;
				}
			}
        }
		
		return false;
    }

	private static boolean dfs(char[][] board, int i, int j, int count, String word) {
		if(word.length() == count) {
			return true;
		}
		
		if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
			return false;
		}
		
		
		char temp = board[i][j];
		board[i][j] = ' ';
		boolean result = dfs(board, i - 1, j, count + 1, word) 
							|| dfs(board, i + 1, j, count + 1, word) 
								|| dfs(board, i, j - 1, count + 1, word) 
									|| dfs(board, i, j + 1, count + 1, word);
		board[i][j] = temp;
		
		return result;
	}
	
}
