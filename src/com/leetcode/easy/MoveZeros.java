package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        int nums[] = {1,2,3};
		int count = 0;
        
        for(int i : nums){
            if(i != 0){
                list.add(i);
            }
            else{
                count++;
            }
        }
        
        while(count != 0){
            list.add(0);
            count--;
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = list.get(i);
        }
	}

}
