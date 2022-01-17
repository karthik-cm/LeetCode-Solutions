package com.leetcode.medium;

public class NumberOfIslands_200 {

	public static void main(String[] args) {
		char[][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
		};
		
		System.out.println(numIslands(grid));
	}
	
	
	// BFS - Flood fill algorithm
	public static int numIslands(char[][] grid) {
        int count = 0;
        
        for(int i=0; i<grid.length; i++) {
        	for(int j=0; j<grid[i].length; j++) {
        		if(grid[i][j] == '1') {
        			count++;
        			bfs(grid, i, j);
        		}
        	}
        }
        
        return count;
    }


	private static void bfs(char[][] grid, int i, int j) {
		// bounding function
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return;
		}
		
		grid[i][j] = '0';
		bfs(grid, i-1, j); // row - up
		bfs(grid, i+1, j); // row - down
		bfs(grid, i, j-1); // column - left
		bfs(grid, i, j+1); // column - right
	}

}
