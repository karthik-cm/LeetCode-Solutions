package com.leetcode.easy;

public class ReverseInteger_7 {

	public static void main(String[] args) {
		int x = -321;
		
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
        try{
            String ans = "";
            String intNum = String.valueOf(x);
        
            for(int i=intNum.length()-1; i>=0; i--){
                char c = intNum.charAt(i);

                if(c != 0 && c != '-'){
                    ans += c;
                }
                if(c == '-'){
                    ans = c + ans;
                }

            }
            return Integer.parseInt(ans);
        }
        catch(Exception e){
            return 0;
        }
    }

}
