package com.leetcode.medium;

public class SentenceSimilarityIII_1813 {

	public static void main(String[] args) {
		// String sentence1 = "My name is Haley";
		// String sentence2 = "My Haley";
		
		String sentence1 = "of";
		String sentence2 = "A lot of words";
		
		System.out.println(areSentencesSimilar(sentence1, sentence2));
	}
	
	
	public static boolean areSentencesSimilar(String sentence1, String sentence2) {
		boolean isEqual = false;
		
		String sent1Arr[] = sentence1.split(" ");
		String sent2Arr[] = sentence2.split(" ");
		
		int sent1ArrLen = sent1Arr.length;
		int sent2ArrLen = sent2Arr.length;
		
		if(sent1ArrLen < sent2ArrLen) {
			return areSentencesSimilar(sentence2, sentence1);
		}
		
		// My name is Haley 
		// My Haley
		
		for(int i=0; i<sent1ArrLen; i++) {
			for(int j=0; j<sent2ArrLen; j++) {
				if(sent1Arr[i].equals(sent2Arr[j])) {
					sent1Arr[i] = "";
				}
			}
		}
		
		String reformattedSentence1 = "";
		
		for(String s : sent1Arr) {
			reformattedSentence1 += s.length() > 0 ? s +" " : "";
		}
		
		reformattedSentence1 = reformattedSentence1.trim();
		
		if((reformattedSentence1 +" " +sentence2).equals(sentence1)) {
			isEqual = true;
		}
		else if((sentence2 +" " +reformattedSentence1).equals(sentence1)) {
			isEqual = true;
		}
		else {
			int splitValue = 0;
			while(!isEqual) {
				String firstPart = sent1Arr[splitValue];
				String lastPart = "";
				
				for(String s : sent2Arr) {
					lastPart += s +" ";
				}
				
				if(firstPart.trim() +" " +reformattedSentence1.trim() +" " +lastPart.trim() != null) {
					isEqual = true;
				}
				splitValue++;
			}
		}
		
		return isEqual;
    }

}
