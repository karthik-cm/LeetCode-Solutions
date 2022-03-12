package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
	// Sum of Subsets problem
	
	public static void main(String[] args) {
		// [2, 3, 6, 7] && target = 7
		int candidates[] = {2,3,5,7};
		int target = 7;
		
		System.out.println(combinationSum(candidates, target));
	}
	
	
	// Backtracking
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, 0, target, candidates, new ArrayList<Integer>(), result);
        return result;
    }
	
    public static void backtrack(int start, int sum, int target, int candidates[], List<Integer> list, List<List<Integer>> result){
        if(sum == target){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start; i<candidates.length && sum<=target; i++){
            sum += candidates[i];
            list.add(candidates[i]);
            backtrack(i, sum, target, candidates, list, result);
            list.remove(list.size()-1);
            sum -= candidates[i];
        }
    }
    
}
