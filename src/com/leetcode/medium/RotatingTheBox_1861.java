package com.leetcode.medium;

import java.util.Arrays;

public class RotatingTheBox_1861 {
	// Rotate the Box (Matrix) by 90 degrees clockwise
	// '#' - Stone, '.' - Empty Space, '*' - Obstacle

	
	public static void main(String[] args) {
		/*char[][] box = {
			{'#', '.', '*'}
		};*/
		
		/*char[][] box = {
			{'#', '.', '*', '.'},
			{'#', '#', '*', '.'}
		};*/
		
		char[][] box = {
			{'#', '#', '*', '.', '*', '.'},
	        {'#', '#', '#', '*', '.', '.'},
			{'#', '#', '#', '.', '#', '.'}
		};
		
		char[][] res = rotateTheBox(box);
		
		print(res);
	}
	
	
	public static char[][] rotateTheBox(char[][] box) {
		int m = box.length;
		int n = box[0].length;
		char[][] res = new char[n][m];
        
        for(int i=0; i<m; i++) {
        	int count = 0; // count of empty spaces from the end - row wise
        	
            for(int j=n-1; j>=0; j--) {
                if(box[i][j] == '.') {
                    count++;
                    res[j][m-i-1] = '.';
                }
                else if(box[i][j] == '*') {
                    count = 0;
                    res[j][m-i-1] = '*';
                }
                else {
                    if(count == 0) {
                        res[j][m-i-1] = '#';
                    }
                    else {
                        res[j][m-i-1] = '.';
                        res[j+count][m-i-1] = '#';
                    }
                }      
            }
        }
        
        return res;
    }
	
	private static void print(char[][] matrix) {
		for(int i=0;i<matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
