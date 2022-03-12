package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentElements_347 {

	public static void main(String[] args) {
		
	}
	
	
	public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1 || nums.length == k){
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        // Sort the map based on decreasing order of values
        List<Entry<Integer, Integer>> mapList = new LinkedList<>(map.entrySet());
        Collections.sort(mapList, (e1, e2) -> e2.getValue() - e1.getValue());
        
        ArrayList<Integer> list = new ArrayList<>();
        for(Entry<Integer,Integer> entry : mapList){
            int key = entry.getKey();
            // int val = entry.getValue();
            
            if(k > 0){
                list.add(key);
                k--;
            }
            
            if(k == 0){
                break;
            }
        }
        
        int result[] = new int[list.size()];
        int index = 0;
        for(int i : list){
            result[index++] = i;
        }
        
        return result;
    }

}
