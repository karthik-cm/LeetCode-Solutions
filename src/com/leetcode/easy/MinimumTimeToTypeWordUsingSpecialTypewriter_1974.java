package com.leetcode.easy;

public class MinimumTimeToTypeWordUsingSpecialTypewriter_1974 {

	public static void main(String[] args) {
		// String word = "abc";
		// String word = "bza";
		String word = "zjpc";
		System.out.println(minTimeToType(word));
		
		
		// curr, target
		/*System.out.println('z'-'a');
		System.out.println('a'-'z');*/
	}
	
	
	public static int minTimeToType(String word) {
        int time = 0;
        char curr = 'a';
        char target = word.charAt(0);
        
        time++;
        time += calTime(curr, target);
       
        for(int i=1; i<word.length(); i++) {
        	curr = target;
        	target = word.charAt(i);
        	
        	// time to print
        	time++;
        	
        	// time to move the pointer 
        	time += calTime(curr, target);
        }
        
        return time;
    }
	
	private static int calTime(char curr, char target) {
		int clockwise = curr-target<0 ? curr-target+26 : curr-target;
		int anticlockwise = target-curr<0 ? target-curr+26 : target-curr;
		
		int time = Math.min(clockwise, anticlockwise);
		return time;
	}

}
