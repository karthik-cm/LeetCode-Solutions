package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {

	public static void main(String[] args) {
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		System.out.println(spiralOrder(matrix));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		
		int rowBegin = 0;
		int rowEnd = matrix.length-1;
		int colBegin = 0;
		int colEnd = matrix[0].length-1;
		
		while(rowBegin <= rowEnd && colBegin <= colEnd) {
			
			// Go right : same row, different column 
			for(int i=colBegin; i<=colEnd; i++) {
				list.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			
			
			// Go down : same column, different row
			for(int i=rowBegin; i<=rowEnd; i++) {
				list.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			
			if(rowBegin <= rowEnd) {
				// Go left : same row,  different column
				for(int i=colEnd; i>=colBegin; i--) {
					list.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;
			
			
			if(colBegin <= colEnd) {
				// Go up : same column, different row
				for(int i=rowEnd; i>=rowBegin; i--) {
					list.add(matrix[i][colBegin]);
				}
			}
			colBegin++;
			
		}
		
		return list;
	}
	
	
	
		
	
	/*public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int rows = matrix.length;
		int columns = matrix[0].length;
		int up = 0;
		int left = 0;
		int right = columns - 1;
		int down = rows - 1;

		while(result.size() < rows * columns) {
			// Traverse from left to right
			for(int col=left; col<=right; col++) {
				result.add(matrix[up][col]);
			}
			
			// Traverse downwards
			for(int row=up+1; row<=down; row++) {
				result.add(matrix[row][right]);
			}
			
			// Make sure we are now on a different row.
			if (up != down) {
				// Traverse from right to left.
				for (int col=right-1; col>=left; col--) {
					result.add(matrix[down][col]);
				}
			}
			
			// Make sure we are now on a different column.
			if(left != right) {
				// Traverse upwards.
				for (int row=down-1; row>up; row--) {
					result.add(matrix[row][left]);
				}
			}
			
			left++;
			right--;
			up++;
			down--;
		}

		return result;
	}*/
}
