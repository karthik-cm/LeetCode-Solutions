package com.leetcode.medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortTheMatrixDiagonally_1329 {

	public static void main(String[] args) {
		
	}
	
	
	public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
		int n = mat[0].length;
		
		HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
		for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                PriorityQueue<Integer> queue = map.getOrDefault(i-j, new PriorityQueue<>());
                queue.add(mat[i][j]);
                map.put(i-j, queue);
            }
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j] = map.get(i-j).poll();
            }
        }
        
        return mat;
    }

}
