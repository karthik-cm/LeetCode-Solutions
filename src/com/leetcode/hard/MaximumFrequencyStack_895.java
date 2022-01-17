package com.leetcode.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFrequencyStack_895 {

	public static void main(String[] args) {

	}
	
	
	Map<Integer, Integer> freqMap;
    Map<Integer, Stack<Integer>> groupMap;
    int maxfreq;
    
    public MaximumFrequencyStack_895() {
        freqMap = new HashMap<>();
        groupMap = new HashMap<>();
        maxfreq = 0;
    }
    
    public void push(int x) {
        int f = freqMap.getOrDefault(x,0)+1;
        freqMap.put(x, f);
        
        if(f > maxfreq) {
            maxfreq = f;
        }

        groupMap.computeIfAbsent(f, z -> new Stack<Integer>()).push(x);
    }
    
    public int pop() {
        int x = groupMap.get(maxfreq).pop();
        freqMap.put(x, freqMap.get(x) - 1);
        
        if(groupMap.get(maxfreq).size() == 0) {
            maxfreq--;
        }
        
        return x;
    }

}
