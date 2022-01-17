package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		String s = "IV";
		
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
        Map<Character, Integer> map = romanToIntMap();
        int num = map.get(s.charAt(s.length()-1));
        
        for(int i=0; i<s.length()-1; i++){
            int currVal = map.get(s.charAt(i));
            int nextVal = map.get(s.charAt(i+1));
            
            if(currVal < nextVal){
                num -= currVal;
            }
            else{
                num += currVal;
            }
        }
        return num;   
    }
    
    private static Map<Character, Integer> romanToIntMap(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

}
