package com.leetcode.easy;

public class RobotReturnToOrigin_657 {

	public static void main(String[] args) {
		String moves = "LLDD";
		System.out.println(judgeCircle(moves));
	}
	
	
	public static boolean judgeCircle(String moves) {
        int upCount=0, downCount=0, leftCount=0, rightCount=0;
        
        for(int i=0; i<moves.length(); i++) {
        	char s = moves.charAt(i);
        	
        	if(s == 'U') {
        		upCount++;
        	}
        	else if(s == 'D') {
        		downCount++;
        	}
        	else if(s == 'L') {
        		leftCount++;
        	}
        	else if(s == 'R'){
        		rightCount++;
        	}
        }
        
        return (Math.abs(upCount-downCount) > 0) || (Math.abs(leftCount-rightCount) > 0) ? false : true;
    }

}
