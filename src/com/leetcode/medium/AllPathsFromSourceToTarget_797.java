package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget_797 {

	public static void main(String[] args) {
		int[][] graph = {
			{1,2},{3},{3}, {}	
		};
		
		System.out.println(allPathsSourceTarget(graph));
	}
	
	
	// Backtracking
	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0); // adding starting 0th node initially
        
        dfs(0, graph, path, list);
        return list;
    }
	
    private static void dfs(int index, int[][] graph, List<Integer> path, List<List<Integer>> list){
    	if(index == graph.length - 1){
            list.add(new ArrayList<>(path));
            return;
        }
    	
        for(int i : graph[index]){
            path.add(i);
            dfs(i, graph, path, list);
            path.remove(path.size()-1); // backtracking
        }
    }

}
