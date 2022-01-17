package com.leetcode.medium;

import java.util.Arrays;

public class MaximumIcecreamBars_1833 {

	public static void main(String[] args) {
		int costs[] = {7,3,3,6,6,6,10,5,9,2};
		int coins = 56;
		
		System.out.println(maxIceCream(costs, coins));
	}
	
	public static int maxIceCream(int[] costs, int coins) {
		int count = 0;
		Arrays.sort(costs);
		
		System.out.println(Arrays.toString(costs));
		
		for(int cost : costs) {
			if(coins > 0) {
				if(cost <= coins) {
					count++;
					coins = coins - cost;
				}
			}
			else {
				break;
			}
		}
		return count;
	}

}
