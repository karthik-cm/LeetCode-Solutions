package com.leetcode.easy;

public class Maximum69Number_1323 {

	public static void main(String[] args) {
		int num = 9999;
		System.out.println(maximum69Number(num));
	}
	
	public static int maximum69Number (int num) {
        String numArr[] = String.valueOf(num).split("");
        String numStr = "";
        
        int index = -1;
        for(int i=0; i<numArr.length; i++){
            String n = numArr[i];
            
            if(n.equals("6")){
                index = i;
                break;
            }
            
            numStr += n;
        }
        
        if(index != -1){
            numArr[index] = "9";
            
            for(int i=index; i<numArr.length; i++) {
            	numStr += numArr[i];
            }
        }
        else {
        	return num;
        }
        
        return Integer.parseInt(numStr);
    }

}
