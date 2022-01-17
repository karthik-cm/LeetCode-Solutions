package com.leetcode.easy;

public class LengthOfLastWord_58 {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
        String strArr[] = s.trim().split(" ");
        int len = strArr.length;
        
        if(len == 0){
            return 0;
        }
        else{
            return strArr[len-1].length();
        }
    }

}
