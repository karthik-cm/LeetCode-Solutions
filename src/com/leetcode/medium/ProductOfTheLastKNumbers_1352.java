package com.leetcode.medium;

import java.util.ArrayList;

public class ProductOfTheLastKNumbers_1352 {

	public static void main(String[] args) {
		
	}
	
	
	ArrayList<Integer> list = null;
    
    public ProductOfTheLastKNumbers_1352() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1;
        int i = list.size()-1;
        
        while(k > 0){
            product *= list.get(i);
            
            if(product == 0){
                break;
            }
            
            i--;
            k--;
        }
        
        return product;
    }

}
