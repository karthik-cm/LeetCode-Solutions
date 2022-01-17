package com.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class JewelsAndStones {
	
	/*
	You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
	Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

	Letters are case sensitive, so "a" is considered a different type of stone from "A".

	Example 1:
	Input: jewels = "aA", stones = "aAAbbbb"
	Output: 3
	
	
	Example 2:
	Input: jewels = "z", stones = "ZZ"
	Output: 0
	*/
	
	
	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		
		System.out.println(numJewelsInStones(jewels, stones));
	}

	
	public static int numJewelsInStones(String jewels, String stones) {
        List<String> jewelsList = Arrays.asList(jewels.split(""));
        int count = (int) Arrays.asList(stones.split(""))
        			.stream()
        			.filter(s -> jewelsList.contains(s))
        			.count();
		return count;
    }
}
