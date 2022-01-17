package com.leetcode.medium;

import java.util.Arrays;

public class DiagonalTraverse_498 {

	public static void main(String[] args) {
		int[][] mat = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		
		System.out.println(Arrays.toString(findDiagonalOrder(mat)));
	}
	
	
	public static int[] findDiagonalOrder(int[][] mat) {
		if(mat == null || mat.length == 0 || mat[0].length == 0) {
			return new int[0];
		}
		
		int rows = mat.length;
		int cols = mat[0].length;
		int arr[] = new int[rows*cols];
		
		int r = 0, c = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = mat[r][c];
			
			if((r+c)%2 == 0) {
				if(c == cols-1) r++;
				else if(r == 0) c++;
				else {
					c++;
					r--;
				}
			}
			else {
				if(r == rows-1) c++;
				else if(c == 0) r++;
				else {
					r++;
					c--;
				}
			}
		}
		
		return arr;
    }

}
