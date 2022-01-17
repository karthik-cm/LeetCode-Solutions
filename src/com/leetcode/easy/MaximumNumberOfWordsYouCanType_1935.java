package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfWordsYouCanType_1935 {

	public static void main(String[] args) {
		String text = "hello world";
		String brokenLetters = "ad";
		
		System.out.println(canBeTypedWords(text, brokenLetters));
	}
	
	public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        
        for(char bl : brokenLetters.toCharArray()){
            list.add(bl);
        }
        
        for(String s : text.split(" ")){
            boolean incrementFlag = true;
        	for(char c : s.toCharArray()){
                if(list.contains(c)){
                	incrementFlag = false;
                    break;
                }
            }
            
        	System.out.println(incrementFlag);
        	
        	if(incrementFlag) {
        		count++;
        	}
        }
        
        return count;
    }

}
