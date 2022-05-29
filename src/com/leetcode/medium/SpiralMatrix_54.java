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
	
	
	// T.C = O(n^2)
	// S.C = O(1)
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0, down = m - 1;
        int left = 0, right = n - 1;
        int dir = 0;
        
        while(top <= down && left <= right){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                
                top++;
            }
            else if(dir == 1){
                for(int i = top; i <= down; i++){
                    result.add(matrix[i][right]);
                }
                
                right--;
            }
            else if(dir == 2){
                for(int i = right; i >= left; i--){
                    result.add(matrix[down][i]);
                }
                
                down--;
            }
            else if(dir == 3){
                for(int i = down; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                
                left++;
            }
            
            
            dir = (dir + 1) % 4;
        }
        
        return result;
	}
	
}
