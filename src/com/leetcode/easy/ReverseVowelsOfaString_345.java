package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfaString_345 {

	public static void main(String[] args) {
		// String s = "hello";
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}
	
	
	// Two pointer Approach
	public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        
        Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.asList(vowels);
        
        char sArr[] = s.toCharArray();
        
        while(left < right){
            if(!list.contains(sArr[left])){
                left++;
            }
            if(!list.contains(sArr[right])){
                right--;
            }
            
            if(list.contains(sArr[left]) && list.contains(sArr[right])){
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                
                left++; right--;
            }
        }
        
        return String.valueOf(sArr);
    }

}
