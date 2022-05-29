package com.leetcode.medium;

public class ReconstructOriginalDigitsFromEnglish_423 {

	public static void main(String[] args) {
		// String s = "owoztneoer";
		// String s = "fviefuro";
		String s = "zerozero";
		
		System.out.println(originalDigits(s));
	}
	
	
	public static String originalDigits(String s) {
		int[] freq = new int[26]; // frequency of characters
		for(char c : s.toCharArray()) {
			freq[c-'a']++;
		}

		int[] digit = new int[10]; // frequency of numbers

		digit[0] = freq['z'-'a']; // zero - z
		digit[2] = freq['w'-'a']; // two - w
		digit[4] = freq['u'-'a']; // four - u
		digit[6] = freq['x'-'a']; // six - x
		digit[8] = freq['g'-'a']; // eight - g
		
		digit[1] = freq['o'-'a'] - digit[2] - digit[4] - digit[0];
		digit[3] = freq['t'-'a'] - digit[8] - digit[2];
		digit[5] = freq['f'-'a'] - digit[4];
		digit[7] = freq['s'-'a'] - digit[6];
		digit[9] = freq['i'-'a'] - digit[5] - digit[6] - digit[8];

		StringBuilder sb=new StringBuilder("");
		
		for(int i = 0; i < 10; i++){
			int count = digit[i];
			
			while(count > 0){
				sb.append(i);
				count--;
			}
		}
		
		return sb.toString();
	}
	
	
	/*public static String originalDigits(String s) {
		StringBuilder result = new StringBuilder();
		
		int count[] = new int[26];
		for(char c : s.toCharArray()) {
			count[c-'a']++;
		}
		
		String alphabetsArr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String digitsArr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		int size = 0;
		int index = 0;
		while(size < s.length()) {
			String num = alphabetsArr[index];
			StringBuilder temp = new StringBuilder();
				
			for(char c : num.toCharArray()) {
				if(count[c-'a'] == 0) {
					break;
				}
				
				if(count[c-'a'] > 0) {
					temp.append(c);
					count[c-'a']--;
				}
			}
				
				
			String numStr = temp.toString();
			if(numStr.equals(num)) {
				result.append(digitsArr[index]);
				index = 0;
				
				size += num.length();
			}
			else {
				for(char c : numStr.toCharArray()) {
					count[c-'a']++;
				}
				
				index++;
			}
		}
		
		return result.toString();
    }*/

}
