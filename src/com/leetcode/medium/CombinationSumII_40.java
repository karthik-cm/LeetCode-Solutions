package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII_40 {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		/*int[] candidates = {2,5,2,1,2};
		int target = 5;*/
		
		System.out.println(combinationSum2(candidates, target));
	}
	
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new LinkedList<Integer>(), results);
        return results;
    }

    private static void backtrack(Integer remain, Integer curr, int[] candidates, LinkedList<Integer> list, List<List<Integer>> results) {
        if(remain == 0) {
            // copy the current combination to the final list.
            results.add(new ArrayList<Integer>(list));
            return;
        }

        for(int nextCurr = curr; nextCurr < candidates.length; ++nextCurr) {
            if(nextCurr > curr && candidates[nextCurr] == candidates[nextCurr - 1])
                continue;

            Integer pick = candidates[nextCurr];
            
            // optimization: early stopping
            if (remain - pick < 0)
                break;

            list.addLast(pick);
            backtrack(remain - pick, nextCurr + 1, candidates, list, results);
            list.removeLast();
        }
    }
	
	

	// Backtracking
	/*public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		dfs(0, 0, target, candidates, new ArrayList<Integer>(), result);
		return result;
    }

	private static void dfs(int index, int sum, int target, int[] candidates, ArrayList<Integer> list, List<List<Integer>> result) {
		if(sum == target) {
			List<Integer> temp = new ArrayList<>(list);
			Collections.sort(temp);
			if(!result.contains(temp)) {
				result.add(new ArrayList<>(temp));
			}
			return;
		}
		
		for(int i=index; i<candidates.length && sum<=target; i++) {
			sum += candidates[i];
			list.add(candidates[i]);
			dfs(i+1, sum, target, candidates, list, result);
			sum -= candidates[i];
			list.remove(list.size()-1);
		}
	}*/

}
