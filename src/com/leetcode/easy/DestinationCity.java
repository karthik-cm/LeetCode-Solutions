package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

	public static void main(String[] args) {
		// [["qMTSlfgZlC","ePvzZaqLXj"],["xKhZXfuBeC","TtnllZpKKg"],["ePvzZaqLXj","sxrvXFcqgG"],
		// ["sxrvXFcqgG","xKhZXfuBeC"],["TtnllZpKKg","OAxMijOZgW"]]
		
		List<String> list = new ArrayList<>();
		List<String> list1 = Arrays.asList("qMTSlfgZlC", "ePvzZaqLXj");
		list.addAll(list1);
		List<String> list2 = Arrays.asList("xKhZXfuBeC", "TtnllZpKKg");
		list.addAll(list2);
	}
	
	public static String destCity(List<List<String>> paths) {
		Map<String, String> map = new HashMap<>();
	    
	    for(List<String> path : paths) {
	        String src = path.get(0);
	        String dest = path.get(1);
	        map.put(src, dest);
	    }
	    
	    for(List<String> path : paths) {
	        // String src = path.get(0);
	        String dest = path.get(1);
	        
	        if(!map.containsKey(dest)) {
	            return dest;
	        }
	    }
	    
	    return "";
	}
	
	/*public static String destCity(List<List<String>> paths) {
		String destCity = null;
		String firstElement = null, secondElement = null;
		List<Integer> skippedCities = new ArrayList<>();
		
		for(int i=0; i<paths.size(); i++) {
			firstElement = paths.get(i).get(0);
			secondElement = paths.get(i).get(1);
			
			if(i == 0) {
				destCity = secondElement;
			}
			else {
				if(destCity != null && destCity.equals(firstElement)) {
					destCity = secondElement;
				}
				else if(skippedCities.size() > 0) {
					firstElement = paths.get(skippedCities.get(0)).get(0);
					secondElement = paths.get(skippedCities.get(0)).get(1);
					
					if(destCity != null && destCity.equals(firstElement)) {
						destCity = secondElement;
					}
				}
				else {
					skippedCities.add(i);
				}
			}
		}
		
		return destCity;
    }*/

}
