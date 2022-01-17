package com.leetcode.easy;

public class BestTimeBuySellStock1_121 {

	public static void main(String[] args) {
		int prices[] = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length && prices[j] > prices[i]; j++) {
				int profit = prices[j] - prices[i];
				if(profit > 0 && profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}
	
	public int maxProfit(int[] prices, int n) {
		int maxProfit = 0;
		int minPrice = prices[0];
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }

}
