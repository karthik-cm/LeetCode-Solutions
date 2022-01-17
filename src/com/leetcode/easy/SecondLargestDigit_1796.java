package com.leetcode.easy;

import java.util.Iterator;
import java.util.TreeSet;

public class SecondLargestDigit_1796 {

	public static void main(String[] args) {
		String s = "dfa12321afd";
		System.out.println(secondHighest(s));
	}
	
	public static int secondHighest(String s) {
		int secondHighest = -1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<s.length(); i++){
        	char c = s.charAt(i);
            if(Character.isDigit(c)){
                set.add(Character.getNumericValue(c));
            }
        }
        
        if(set.size() > 1) {
        	Iterator<Integer> itr = set.descendingIterator();
        	int count = 0;
        	while(itr.hasNext()) {
        		itr.next();
        		count++;
        		
        		if(count == 1) {
        			secondHighest = itr.next();
        			break;
        		}
        	}
        }
        
        return secondHighest;
    }
}
