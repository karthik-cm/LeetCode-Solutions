package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching_1023 {

	public static void main(String[] args) {
		String queries[] = {"CompetitiveProgramming","CounterPick","ControlPanel"};
		String pattern = "Coop";		
		
		System.out.println("\n"+camelMatch(queries, pattern));
	}
	
	public static List<Boolean> camelMatch(String[] queries, String pattern) {
		List<Boolean> boolList = new ArrayList<>();
	    
	    for(String query : queries) {
	    	int index = 0;
	        boolean result = true;
	        
	        for(char c : query.toCharArray()) {
	        	if(index < pattern.length() && c == pattern.charAt(index)){
	        		index++;
	        		continue;
	        	}	        
	        
	        	if(c >= 'A' && c <= 'Z'){
	        		if(index >= pattern.length() || c != pattern.charAt(index)){
	        			result = false;
	        			break;
	        		}
	        	}
	        }
	        
	        result = result && index == pattern.length();
	        
	        boolList.add(result);
	    }
	    
	    return boolList;
	}
	
	/*public static List<Boolean> camelMatch(String[] queries, String pattern) {
		List<Boolean> boolList = new LinkedList<>();
		List<HashMap<Character,Integer>> pattList = splitCamelCase(pattern);
		
		Arrays.stream(queries).forEach(query -> {
			List<HashMap<Character,Integer>> queryList = splitCamelCase(query);
			
			if(pattList.size() == queryList.size()) {
				for(int i=0; i<queryList.size()-1; i++) {
					boolean isEquals = compare(queryList.get(i), pattList.get(i)) && compare(queryList.get(i+1), pattList.get(i+1));
					boolList.add(isEquals);
				}
			}
			else{
				boolList.add(false);
			}
		});
		
		return boolList;
    }
	
	public static List<HashMap<Character,Integer>> splitCamelCase(String query) {
		List<HashMap<Character,Integer>> list = new LinkedList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<query.length(); i++) {
			char c = query.charAt(i);
			
			if(Character.isUpperCase(c) && i!=0) {
				list.add(map);
				map = new HashMap<>();
			}
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		list.add(map);
		
		return list;
	}
	
	public static boolean compare(HashMap<Character,Integer> queryMap, HashMap<Character,Integer> pattMap) {
		boolean isEquals = false;
		int count = 0;
		
		for(Map.Entry<Character, Integer> pEntry : pattMap.entrySet()) {
			int key = pEntry.getKey();
			int value = pEntry.getValue();
			
			for(Map.Entry<Character, Integer> qEntry : queryMap.entrySet()) {
				if(qEntry.getKey() == key && qEntry.getValue() == value) {
					count++;
				}
			}
		}
		
		isEquals = (count == pattMap.size()) ? true : false;
		
		return isEquals;
	}*/
	
}
