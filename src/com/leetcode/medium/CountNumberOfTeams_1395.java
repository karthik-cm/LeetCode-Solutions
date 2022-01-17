package com.leetcode.medium;

public class CountNumberOfTeams_1395 {

	public static void main(String[] args) {
		
	}
	
	
	public int numTeams(int[] rating) {
		int noOfTeams = 0;
		
		for(int i=1; i<rating.length-1; i++){
            int leftLess=0, leftGreater=0;
            int rightLess=0, rightGreater=0;
            
            for(int j=i-1; j>=0; j--){
                if(rating[i] > rating[j]){
                    leftLess++;
                }else{
                    leftGreater++;
                }
            }
            
            for(int j=i+1;j<rating.length;j++){
                if(rating[i] < rating[j]){
                    rightGreater++;
                }else{
                    rightLess++;
                }
            }
            
            noOfTeams += (leftLess*rightGreater) + (leftGreater*rightLess); // i<j<k + i>j>k
        }
		
		return noOfTeams;
    }

}
