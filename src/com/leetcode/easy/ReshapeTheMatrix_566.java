package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReshapeTheMatrix_566 {

	public static void main(String[] args) {
		int[][] mat = {{1,2}, {3,4}};
		int r = 1;
		int c = 4;
		
		matrixReshape(mat, r, c);
	}
	
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int row = mat.length;
		int col = mat[0].length;
		
		if(row*col == r*c) {
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					list.add(mat[i][j]);
				}
			}
			
			int mat2[][] = new int[r][c];
			int index = 0;
			
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					mat2[i][j] = list.get(index++);
				}
			}
			
			print(mat2);
			
			return mat2;
		}
		else {
			return mat;
		}
    }
	
	private static void print(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
