package com.leetcode.medium;

public class AddMinimumNumberOfRungs_1936 {

	public static void main(String[] args) {
		int rungs[] = {1,3,5,10};
		int dist = 2;
		
		/*int rungs[] = {3,4,6,7};
		int dist = 2;*/
		
		System.out.println(addRungs(rungs, dist));
	}
	
	public static int addRungs(int[] rungs, int dist) {
		int count = (rungs[0] - 1) / dist;
		
		for(int i=1; i<rungs.length; i++) {
			count += (rungs[i] - rungs[i-1] - 1) / dist;
		}
		
		return count;
    }
	
	
	
	// Sliding window
	/*public static int addRungs(int[] rungs, int dist) {
		int count = 0;
		
		int curr = 0;
		int next;
		
		for(int i=0; i<rungs.length; i++) {
			next = rungs[i];
			
			while(next - curr > dist) {
				count++;
				curr = curr + dist;
			}
			
			curr = next;
		}
		
		return count;
    }*/

}
