package com.leetcode.easy;

public class ImplementStrStr_28 {

	public static void main(String[] args) {
		String haystack = "abcde";
		String needle = "cde";
		
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
        	return 0;
        }
        
        // abcde
        // cde
        for(int i=0; i<=haystack.length() - needle.length(); i++) {
            
        	for(int j=needle.length()-1; j >= 0; j--) {

                if(haystack.charAt(i+j) != needle.charAt(j)) {
                	break;
                }

                if(j == 0) {
                    return i;
                }
            }
        }
        
        return - 1;
    }
	
	
	
	/*public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0 || needle.length() == 0){
            return 0;
        }
        
        for(int i=0; i<haystack.length(); i++){
            int tempIndex = i;
            
            for(int j=0; j<needle.length(); j++){
                
                if(haystack.charAt(tempIndex) == needle.charAt(j)){
                    if(j == needle.length() - 1){
                        return tempIndex-j;
                    }
                }
                else{
                    break;   
                }
                
                if(tempIndex < haystack.length() - 1){
                    tempIndex++;
                }
                
                
            }   
        }
        
        return -1;
    }*/

}
