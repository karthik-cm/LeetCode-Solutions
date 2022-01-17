package com.leetcode.medium;

import java.util.Arrays;

public class RotateImage_48 {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3}, 
			{4,5,6},
			{7,8,9}
		};
		
		System.out.println("Original Matrix : ");
		print(matrix);
		
		rotate(matrix);
	}
	
	
	public static void rotate(int[][] matrix) {
        transpose(matrix);
        System.out.println("After Transpose Matrix : ");
		print(matrix);
		
		reflect(matrix); // reverse(matrix)
		System.out.println("Reflect Matrix : ");
		print(matrix);
    }
    
	
	// Transpose - change rows to columns
    private static void transpose(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
    // Reflect - reverse the matrix row wise
	private static void reflect(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n; i++) {
			int row[] = matrix[i];
			
			int left = 0;
			int right = n-1;
			
			while(left <= right) {
				int temp = row[left];
				row[left] = row[right];
				row[right] = temp;
				
				left++;
				right--;
			}
		}
	}

	
	
	private static void print(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
