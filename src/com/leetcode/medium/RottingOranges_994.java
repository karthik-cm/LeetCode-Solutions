package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class RottingOranges_994 {

	public static void main(String[] args) {
		
	}
	
	
	public int orangesRotting(int[][] grid) {
        Set<String> fresh = new HashSet<>();
        Set<String> rotten = new HashSet<>();
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int i=0; i<rows; i++) {
        	for(int j=0; j<cols; j++) {
            	if(grid[i][j] == 1) {
            		fresh.add("" +i +j);
            	}
            	else if(grid[i][j] == 2) {
            		rotten.add("" +i +j);
            	}
            }
        }
        
        
        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 4 directions - Up, Down, Left, Right
        
        while(fresh.size() > 0) {
        	Set<String> infected = new HashSet<>();
        	
        	for(String rot : rotten) {
        		int i = rot.charAt(0) - '0'; // char '2' - char '0' = int 2
        		int j = rot.charAt(1) - '0';
        		
        		for(int[] direction : directions) {
        			int nextI = i + direction[0];
        			int nextJ = j + direction[1];
        			
        			String nextOrange = "" +nextI +nextJ;
        			
        			if(fresh.contains(nextOrange)) {
        				fresh.remove(nextOrange);
        				infected.add(nextOrange);
        			}
        		}
        	}
        	
        	if(infected.size() == 0) {
    			return -1; // not able to infect any surrounding oranges
    		}
    		
    		rotten = infected;
    		minutes++;
        }
        
        return minutes;
    }

}
