package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterNodeInLinkedList_1019 {

	public static void main(String[] args) {
		
	}
	
	
	public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            
            while(next != null){
                if(next.val > curr.val){
                    list.add(next.val);
                    curr = curr.next;
                    break;
                }
                else{
                    next = next.next;
                }
            }
            
            if(next == null){
                list.add(0);
                curr = curr.next;
            }
        }
        
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }

}
