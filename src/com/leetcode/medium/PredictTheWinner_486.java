package com.leetcode.medium;

public class PredictTheWinner_486 {

	public static void main(String[] args) {
		int[] nums = {2, 4, 55, 6, 8};
		System.out.println(PredictTheWinner(nums));
	}
	
	public static boolean PredictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 1) >= 0;
    }
    
    public static int winner(int[] nums, int s, int e, int turn) {
    	if(s == e)
    		return turn * nums[s];
        
        int a = turn * nums[s] + winner(nums, s+1, e, -turn);
        int b = turn * nums[e] + winner(nums, s, e-1, -turn);
        
        return turn * Math.max(turn * a, turn * b);
    }
	
	
	/*public static boolean PredictTheWinner(int[] nums) {
        Integer[][] memo = new Integer[nums.length][nums.length];
        return winner(nums, 0, nums.length - 1, memo) >= 0;
    }
	
    public static int winner(int[] nums, int s, int e, Integer[][] memo) {
        if(s == e)
            return nums[s];
        
        if(memo[s][e] != null)
            return memo[s][e];
        
        int a = nums[s] - winner(nums, s + 1, e, memo);
        int b = nums[e] - winner(nums, s, e - 1, memo);
        
        memo[s][e] = Math.max(a, b);
        return memo[s][e];
    }
	
    
    // Dynamic Programming
    public static boolean PredictTheWinner2(int[] nums) {
    	int[] dp = new int[nums.length];
        
        for(int s=nums.length; s>=0; s--) {
            for(int e=s+1; e<nums.length; e++) {
                int a = nums[s] - dp[e];
                int b = nums[e] - dp[e - 1];
                
                dp[e] = Math.max(a, b);
            }
        }
        
        return dp[nums.length - 1] >= 0;
    }*/
    
	
	
	
	/*public static boolean predictWinner(int[] nums) {
        boolean finalResult = false;
        boolean result1 = false, result2 = false;
        int player1Score = 0, player2Score = 0;
        
        if(nums != null && nums.length >= 1 && nums.length <= 20){
            boolean isFirstPlayer = true;
            
        	for(int i=0; i<nums.length; i++){
                if(isFirstPlayer){
                    player1Score += nums[i];
                    isFirstPlayer = false;
                }
                else{
                    player2Score += nums[i];
                    isFirstPlayer = true;
                }
            }
            
            if(player1Score >= player2Score){
                result1 = true;
            }
            else{
                player1Score = 0; player2Score = 0;
                isFirstPlayer = true;
                
                for(int i=nums.length-1; i>=0; i--){
                	if(isFirstPlayer){
                        player1Score += nums[i];
                        isFirstPlayer = false;
                    }
                    else{
                        player2Score += nums[i];
                        isFirstPlayer = true;
                    }
                }
                
                if(player1Score >= player2Score){
                    result2 = true;
                }
            }
            
            finalResult = result1 || result2;
        }
        
        return finalResult;
    }*/
}
