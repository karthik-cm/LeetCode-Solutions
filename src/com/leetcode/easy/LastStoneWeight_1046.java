package com.leetcode.easy;

import java.util.PriorityQueue;

public class LastStoneWeight_1046 {

	public static void main(String[] args) {
		int stones[] = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));
	}
	
	
	
	// Max Heap
	// T.C = O(NlogN)
	// S.C = O(N)
	public static int lastStoneWeight(int[] stones) {
		// maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        
        for(int stone : stones){
            maxHeap.add(stone); // O(NlogN)
        }
        
        
        while(maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            
            if(x != y){
                maxHeap.add(y - x);
            }
        }
        
        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
    }

}