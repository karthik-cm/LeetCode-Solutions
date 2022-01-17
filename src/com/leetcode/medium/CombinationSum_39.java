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
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList= new ArrayList<>();
        dfs(0, target, 0, candidates, new ArrayList<Integer>(), finalList);
        return finalList;
    }
    
	
	// Backtracking - DFS
    public static void dfs(int start, int target, int sum, int candidates[], List<Integer> list, List<List<Integer>> finalList){
        if(sum == target){
            finalList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start; i<candidates.length && sum<=target; i++){
            sum += candidates[i];
            list.add(candidates[i]);
            dfs(i, target, sum, candidates, list, finalList);
            sum -= candidates[i];
            list.remove(list.size()-1);
        }
    }
    
}
