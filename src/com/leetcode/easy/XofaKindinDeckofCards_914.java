package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class XofaKindinDeckofCards_914 {

	public static void main(String[] args) {
		int deck[] = {1,1,1,2,2,2,3,3};
		System.out.println(hasGroupsSizeX(deck));
	}
	
	// Use GCD
	public static boolean hasGroupsSizeX(int[] deck) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : deck) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		ArrayList<Integer> al = new ArrayList<>(map.values());
		
		// Use G.C.D
		int x = al.get(0), y;
		
		for(int i=1; i<al.size(); i++) {
			y = al.get(i);
			x = calcGcd(x, y);
		}
		
		return x >= 2;
    }
	
	public static int calcGcd(int x, int y) {
        return (x == 0) ? y : calcGcd(y%x, x);
    }

}
