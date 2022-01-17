package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame_682 {

	public static void main(String[] args) {
		
	}
	
	
	public static int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int N;
        
        for(String op : ops) {
        	N = list.size();
        	
        	if(op.equalsIgnoreCase("C")) {
        		list.remove(N-1);
        	}
        	else if(op.equalsIgnoreCase("D")) {
        		int prevScore = list.get(N-1);
        		list.add(prevScore * 2);
        	}
        	else if(op.equalsIgnoreCase("+")) {
        		int lastScore = list.get(N-1);
        		int lastButOneScore = list.get(N-2);
        		
        		list.add(lastScore + lastButOneScore);
        	}
        	else {
        		list.add(Integer.parseInt(op));
        	}
        }
        
        N = list.size();
        int sum = 0;
        int left = 0;
        int right = N-1;
        
        while(left <= right) {
        	sum += list.get(left);
        	sum += list.get(right);
        	left++;
        	right--;
        }
        
        if(N % 2 == 1) {
        	sum -= list.get(list.size()/2);
        }
        
        return sum;
    }

}
