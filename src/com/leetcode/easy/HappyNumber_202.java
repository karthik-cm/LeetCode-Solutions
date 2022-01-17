package com.leetcode.easy;

import java.util.HashSet;

public class HappyNumber_202 {

	// Easy #202
	
	public static void main(String[] args) {
		System.out.println(isHappy2(19));
	}
	
	public static boolean isHappy(int n) {
		boolean isHappyValue = false;
		String numStr[] = String.valueOf(n).split("");
		int sum = 0;
		
		for(String num : numStr) {
			sum += (int) Math.pow(Integer.parseInt(num), 2);
		}
		
		if(sum == 1) {
			isHappyValue = true;
		}else {
			isHappyValue = isHappy(sum);
		}
		return isHappyValue;
	}
	
	
	public static boolean isHappy2(int n) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time : "+startTime);
		boolean isHappyValue = false;
		
		while(!isHappyValue) {
			int sum = 0;
			String numStr[] = String.valueOf(n).split("");
			
			for(String num : numStr) {
				sum += (int) Math.pow(Integer.parseInt(num), 2);
			}
			
			if(sum == 1) {
				isHappyValue = true;
			}else {
				n = sum;
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("End Time : "+endTime);
		System.out.println("Total Time Taken = "+(endTime-startTime));
		
		return isHappyValue;
	}
	
	
	// DP solution
	public static boolean isHappy3(int n) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
	    while(!hashSet.contains(n)) {
	        hashSet.add(n);
	        int temp = 0;
	        while(n > 0) {
	            temp += Math.pow(n % 10, 2);
	            n /= 10;
	        }
	        n = temp;
	    }
	    return n == 1;
	}

}
