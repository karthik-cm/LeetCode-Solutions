package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix_1380 {

	public static void main(String[] args) {
		/*int[][] matrix = {
			{3, 7, 8}, 
			{9, 11, 13}, 
			{15, 16, 17}
		};*/
		
		int[][] matrix = {
			{1, 10, 4, 2}, 
			{9, 3, 8, 7}, 
			{15, 16, 17, 12}
		};
		
		
		System.out.println(luckyNumbers(matrix));
	}
	
	
	public static List<Integer> luckyNumbers (int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		List<Integer> rowList = new ArrayList<>();
		List<Integer> colList = new ArrayList<>();
		
		for(int i=0; i<row; i++) {
			int rowVal = Integer.MAX_VALUE;
			
			for(int j=0; j<col; j++) {
				rowVal = Math.min(rowVal, matrix[i][j]);
			}
			
			rowList.add(rowVal);
		}
		
		for(int j=0; j<col; j++) {
			int colVal = Integer.MIN_VALUE;
			
			for(int i=0; i<row; i++) {
				colVal = Math.max(colVal, matrix[i][j]);
			}
			
			colList.add(colVal);
		}
		
		
		System.out.println(rowList);
		System.out.println(colList);
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(rowList.get(i) == matrix[i][j] && colList.get(j) == matrix[i][j]) {
					list.add(rowList.get(i));
				}
			}
		}
		
		return list;
	}

}
