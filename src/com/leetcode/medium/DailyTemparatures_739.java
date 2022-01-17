package com.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemparatures_739 {

	public static void main(String[] args) {
		// int temperatures[] = {73,74,75,71,69,72,76,73};
		int temperatures[] = {55,38,53,81,61,93,97,32,43,78};
		System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
	}
	
	
	public static int[] dailyTemperatures(int[] temperatures) {
		int[] warmerTemp = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){ 
                int index = stack.pop();
                warmerTemp[index] = i-index;
            }
            
            stack.push(i);
        }
        
        return warmerTemp;
    }
	
	
	/*public static int[] dailyTemperatures(int[] temperatures) {
		if(temperatures != null && temperatures.length > 0) {
			int warmerTemp[] = new int[temperatures.length];
			
			for(int i=0; i<temperatures.length-1; i++) {
				for(int j=i+1; j<temperatures.length; j++) {
					if(temperatures[j] > temperatures[i]) {
						warmerTemp[i] = j-i;
						break;
					}
				}
			}
			
			return warmerTemp;
		}
		
		return new int[] {};
    }*/

}
