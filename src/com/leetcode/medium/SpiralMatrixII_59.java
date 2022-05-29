package com.leetcode.medium;

public class SpiralMatrixII_59 {

	public static void main(String[] args) {
		int n = 4;
		
		generateMatrix(n);
	}
	
	
	// T.C = O(n^2)
	// S.C = O(1) - exclude matrix result[][]
	public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int top = 0, down = n - 1; 
        int left = 0, right = n - 1;
        int element = 1;
        int dir = 0;
        
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = element++;
                }
                
                top++;
            }
            else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    matrix[i][right] = element++;
                }
                
                right--;
            }
            else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[down][i] = element++;
                }
                
                down--;
            }
            else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    matrix[i][left] = element++;
                }
                
                left++;
            }
            
            dir = (dir + 1) % 4;
        }
        
        return matrix;
    }
	
	
	/*private static void print(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}*/

}
