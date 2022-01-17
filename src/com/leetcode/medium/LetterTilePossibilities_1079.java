package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LetterTilePossibilities_1079 {

	public static void main(String[] args) {
		
	}
	
	int count = 0;
    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : tiles.toCharArray()) {
        	map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        dfs(map);
        return count;
    }
    
    void dfs(Map<Character, Integer> map) {
        for(char c : map.keySet()) {
            if(map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                count++;
                dfs(map);
                map.put(c, map.get(c) + 1);
            }
        }
    }

}
