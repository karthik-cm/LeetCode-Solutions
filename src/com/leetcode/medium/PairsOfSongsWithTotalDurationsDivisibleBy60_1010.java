package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class PairsOfSongsWithTotalDurationsDivisibleBy60_1010 {

	public static void main(String[] args) {
		int[] time = {30,20,150,100,40};
		
		System.out.println(numPairsDivisibleBy60(time));
	}
	
	
	public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < time.length; i++) {
            int key = time[i] % 60;
            int pairedKey = (key == 0) ? key : 60 - key;
            
            if(map.containsKey(pairedKey)) {
            	count += map.get(pairedKey);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        return count;
    }
	
	
	/*public static int numPairsDivisibleBy60(int[] time) {
		int remainders[] = new int[60];
        int count = 0;
        
        for (int t : time) {
            if (t % 60 == 0) { // check if a%60==0 && b%60==0
                count += remainders[0];
            }
            else { // check if a%60 + b%60 == 60
                count += remainders[60 - t % 60];
            }
            
            remainders[t % 60]++; // remember to update the remainders
        }
        
        return count;
    }*/

}
