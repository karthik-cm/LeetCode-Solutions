package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz_412 {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(fizzBuzz(n));
	}
	
	
	
	public static List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Fizz");
		map.put(5, "Buzz");
		
		for(int i = 1; i <= n; i++) {
			String value = "";
			
			for(Integer num : map.keySet()) {
				if(i % num == 0) {
					value += map.get(num);
				}
			}
			
			if(value.isEmpty()) {
				value += String.valueOf(i);
			}
			
			result.add(value);
		}
		
		return result;
	}
	
	
	
	// Naive Approach
	/*public static List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			String value = "";
			
			if(i % 3 == 0 && i % 5 == 0) {
				value = "FizzBuzz";
			}
			else if(i % 3 == 0) {
				value = "Fizz";
			}
			else if(i % 5 == 0) {
				value = "Buzz";
			}
			else {
				value = String.valueOf(i);
			}
			
			result.add(value);
		}
		
		return result;
    }*/

}
