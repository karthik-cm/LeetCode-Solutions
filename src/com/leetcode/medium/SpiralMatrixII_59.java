package com.leetcode.medium;

import java.util.Arrays;

public class SpiralMatrixII_59 {

	public static void main(String[] args) {
		int n = 4;
		
		generateMatrix(n);
	}
	
	
	// nxn matrix
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1;
		int numSq = n*n; 
		
		int rowBegin = 0;
		int rowEnd = n-1;
		int colBegin = 0;
		int colEnd = n-1;
		
		while(num <= numSq) {
			for(int i=colBegin; i<=colEnd; i++) {
				matrix[rowBegin][i] = num++;
			}
			rowBegin++;
			
			for(int i=rowBegin; i<=rowEnd; i++) {
				matrix[i][colEnd] = num++;
			}
			colEnd--;
			
			if(num <= numSq) {
				for(int i=colEnd; i>=colBegin; i--) {
					matrix[rowEnd][i] = num++;
				}
				rowEnd--;
			}
			
			if(num <= numSq) {
				for(int i=rowEnd; i>=rowBegin; i--) {
					matrix[i][colBegin] = num++;
				}
				colBegin++;
			}
		}
		
		print(matrix);
		
		return matrix;
    }
	
	
	private static void print(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
