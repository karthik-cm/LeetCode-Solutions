package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle_120 {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		triangle.add(list);
		
		list = new ArrayList<>();
		list.add(2);
		list.add(3);
		triangle.add(list);
		
		
		list = new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(-3);
		triangle.add(list);
		
		System.out.println(triangle);
		
		System.out.println(minimumTotal(triangle));
	}
	
	public static int minimumTotal(List<List<Integer>> triangle) {
		for(int i=triangle.size()-2; i>=0; i--) {
            for(int j=0; j<triangle.get(i).size(); j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) +
                		Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

}
