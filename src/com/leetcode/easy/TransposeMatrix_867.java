package com.leetcode.easy;

public class TransposeMatrix_867 {

	public static void main(String[] args) {
		
	}
	
	
	public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
		int col = matrix[0].length;
		
		int[][] transpose = new int[col][row];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		return transpose;
    }

}
