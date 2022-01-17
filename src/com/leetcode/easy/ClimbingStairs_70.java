package com.leetcode.easy;

public class ClimbingStairs_70 {

	public static void main(String[] args) {
		int n = 3;
		// 1,1,1
		// 1,2
		// 2,1
		
		System.out.println(climb_Stairs(0, n));
	}
	
	public static int climbStairs(int n) {
        // return climb_Stairs(0, n);
		
		if(n == 1) {
            return 1;
        }
        
        int first = 1;
        int second = 2;
        
        for(int i=3; i<=n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
    
    public static int climb_Stairs(int i, int n) {
        if(i > n) {
            return 0;
        }
        
        if(i == n) {
            return 1;
        }
        
        return climb_Stairs(i+1, n) + climb_Stairs(i+2, n);
    }

}
