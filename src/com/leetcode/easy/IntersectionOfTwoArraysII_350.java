package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII_350 {

	public static void main(String[] args) {
		
	}
	
	
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> temp = new ArrayList<>();
        
        if(len1 >= len2){
            for(int n1 : nums1){
                temp.add(n1);
            }
            
            for(int n2 : nums2){
                if(temp.contains(n2)){
                    temp.remove(n2);
                    list.add(n2);
                }
            }
        }
        else{
            for(int n2 : nums2){
                temp.add(n2);
            }
            
            for(int n1 : nums1){
                if(temp.contains(n1)){
                    list.add(n1);
                }
            }
        }
        
        int res[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        
        return res; 
    }

}
