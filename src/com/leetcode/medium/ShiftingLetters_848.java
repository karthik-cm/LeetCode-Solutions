package com.leetcode.medium;

public class ShiftingLetters_848 {

	public static void main(String[] args) {
		// Test
		/*char c = 'r';
		int shift = 52;
		System.out.println(shiftChar(c, shift));*/
		
		
		// Problem
		String s = "ruu";
		int[] shifts = {26,9,17};
		
		System.out.println(shiftingLetters(s, shifts));
	}
	
	public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        long shift = 0;
        
        for(int i=s.length()-1; i>=0; i--){
        	char c = (char)((s.charAt(i)-'a' + (shift+shifts[i])%26) % 26 + 'a');
            ans.setCharAt(i, c);
            shift += shifts[i];
        }
        
        return ans.toString();
    }
	
	
	
	
	/*public static String shiftingLetters(String s, int[] shifts) {
		char sArr[] = s.toCharArray();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int shift = 0;
			
			for(int j=i; j<s.length(); j++) {
				shift += shifts[j];
			}
			
			sArr[i] = shiftChar(c, shift);
		}
		
		return new String(sArr);
    }
	
	private static char shiftChar(char c, int shift) {
		while(shift >= 26) {
			shift = shift % 26;
		}
		
		char ch = (char) (c + shift);
		int ascii = ch;
		
		if(ascii > 122) {
			ascii = (ascii%122) + 97 - 1;
		}
		
		return (char) ascii;
	}*/

}
