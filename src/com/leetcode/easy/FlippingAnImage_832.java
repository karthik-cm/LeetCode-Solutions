package com.leetcode.easy;

import java.util.Arrays;

public class FlippingAnImage_832 {

	public static void main(String[] args) {
		int[][] image = new int[][] {{1,1,0},{1,0,1},{0,0,0}};
		
		System.out.println(Arrays.toString(flipAndInvertImage(image)));
	}
	
	
	public static int[][] flipAndInvertImage(int[][] image) {
		int invertedImage[][] = new int[image.length][image.length];
		
		for(int i=0; i<image.length; i++) {
			int currArr[] = image[i];
			int invertedArr[] = new int[image.length];
			int index = 0;
			
			for(int j=currArr.length-1; j>=0; j--) {
				invertedArr[index] = currArr[j] == 0 ? 1 : 0;
				index++;
			}
			invertedImage[i] = invertedArr;
			System.out.println(Arrays.toString(invertedArr));
		}
		
		return invertedImage;
	}

}
