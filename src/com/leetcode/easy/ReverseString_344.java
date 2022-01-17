package com.leetcode.easy;

public class ReverseString_344 {

	public static void main(String[] args) {
		char s[] = {'h','e','l','l','o'};
		reverseString(s);
	}
	
	public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        
        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

	
	/*public void reverseString(char[] s) {
        String sStr = String.valueOf(s);
        StringBuilder sb = new StringBuilder(sStr);
        char sRev[] = sb.reverse().toString().toCharArray();
        System.arraycopy(sRev, 0, s, 0, s.length);
    }*/
}
