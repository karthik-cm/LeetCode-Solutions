package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysToAddParentheses {

	public static void main(String[] args) {
		
	}
	
	
	public static List<Integer> diffWaysToCompute(String expression) {
		return diffWaysToCompute(expression, new HashMap<>());
	}

	private static List<Integer> diffWaysToCompute(String expression, Map<String, List<Integer>> map) {
		if(map.containsKey(expression)) {
			return map.get(expression);
		}
			
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (!hasOperator(expression)) {
			// base case
			list.add(Integer.parseInt(expression));
		}
		else {
			// Recursive case. DFS
			for(int i=0; i<expression.length(); i++) {
				char symbol = expression.charAt(i);
			
				if (!Character.isDigit(symbol)) {
					List<Integer> left = diffWaysToCompute(expression.substring(0, i), map);
					List<Integer> right = diffWaysToCompute(expression.substring(i + 1), map);
					
					for(int l : left) {
						for(int r : right) {
							switch (symbol) {
								case '+': list.add(l + r);
								break;
								case '-': list.add(l - r);
								break;
								case '*': list.add(l * r);
								break;
							}
						}
					}
				}
			}
		}
		
		map.put(expression, list);
		return list;
	}

	private static boolean hasOperator(String expression) {
		for(int i=0; i<expression.length(); i++) {
			switch (expression.charAt(i)) {
				case '+':
				case '-': 
				case '*': 
					return true;
			}
		}
		
		return false;
	}

}
