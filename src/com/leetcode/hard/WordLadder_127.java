package com.leetcode.hard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder_127 {

	public static void main(String[] args) {
		
	}
	
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> dict = new HashSet<>();
		for(String word : wordList){
			dict.add(word);
		}

		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);
		int level = 1;

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int q = 0; q < size; q++) {
				char[] curr = queue.poll().toCharArray();

				for (int i = 0; i < curr.length; i++) {
					char temp = curr[i];

					for (char c='a'; c <= 'z'; c++) {
						curr[i] = c;

						String dest = new String(curr);
						if (dict.contains(dest)) {
							if (dest.equals(endWord)){
								return level+1;   
							}

							queue.add(dest);
							dict.remove(dest);
						}
					}

					curr[i] = temp;
				}
			}

			level++;
		}

		return 0;
	}

}
