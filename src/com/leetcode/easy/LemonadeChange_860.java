package com.leetcode.easy;

public class LemonadeChange_860 {

	public static void main(String[] args) {
		int bills[] = {5,5,10,10,5,20,5,10,5,5};
		System.out.println(lemonadeChange(bills));
	}
	
	
	public static boolean lemonadeChange(int[] bills) {
		if(bills[0] == 10 || bills[0] == 20) {
			return false;
		}
		
		int fiveCount = 0;
		int tenCount = 0;
		
		for(int b : bills) {
			if(b == 5) {
				fiveCount++;
			}
			else if(b == 10) {
				tenCount++;
				fiveCount--;
				
				if(fiveCount < 0) {
					return false;
				}
			}
			else {
				if(tenCount >= 1 && fiveCount >= 1) {
					tenCount--;
					fiveCount--;
				}
				else if(tenCount == 0 && fiveCount >= 3) {
					fiveCount -= 3;
				}
				else {
					return false;
				}
			}
		}
		
		return true;
    }

}
