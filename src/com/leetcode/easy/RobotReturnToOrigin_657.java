package com.leetcode.easy;

public class RobotReturnToOrigin_657 {

	public static void main(String[] args) {
		String moves = "LLDD";
		System.out.println(judgeCircle(moves));
	}
	
	
	public static boolean judgeCircle(String moves) {
        int leftCount = 0;
        int rightCount = 0;
        int upCount = 0;
        int downCount = 0;
        
        for(char c : moves.toCharArray()){
            if(c == 'U'){
                upCount++;
            }
            else if(c == 'D'){
                downCount++;
            }
            else if(c == 'L'){
                leftCount++;
            }
            else if(c == 'R'){
                rightCount++;
            }
        }
        
        
        if(Math.abs(upCount - downCount) > 0 || Math.abs(leftCount - rightCount) > 0){
            return false;
        }
        
        return true;
    }

}
