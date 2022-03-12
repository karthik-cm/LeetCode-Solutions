package com.leetcode.easy;

public class ShortestWordDistance_243 {

	public static void main(String[] args) {
		
	}
	
	
	// T.C = O(N.M)
	// S.C = O(1)
	public static int shortestDistance(String[] wordsDict, String word1, String word2) {
		int i1 = -1, i2 = -1;
        int minDist = wordsDict.length;
        
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                i1 = i;
            } 
            else if (wordsDict[i].equals(word2)) {
                i2 = i;
            }

            if (i1 != -1 && i2 != -1) {
                minDist = Math.min(minDist, Math.abs(i1 - i2));
            }
        }
        
        return minDist;
    }

}
