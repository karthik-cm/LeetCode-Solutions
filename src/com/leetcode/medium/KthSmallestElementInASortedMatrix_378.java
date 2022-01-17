package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInASortedMatrix_378 {

	public static void main(String[] args) {
		
	}
	
	
	public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
        }
        
        Collections.sort(list);
        
        
        return list.get(k-1);
    }

}
