package com.leetcode.medium;

import java.util.Map;
import java.util.TreeMap;

public class RemoveDuplicatesFromSortedListII_82 {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new TreeMap<>();
        while(head != null){
            map.put(head.val, map.getOrDefault(head.val, 0)+1);
            head = head.next;
        }
        
        ListNode newHead = null, temp = null;
        boolean flag = true;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                int value = entry.getKey();
                
                if(!flag){
                    temp.next = new ListNode(value);
                    temp = temp.next;
                }
                else{
                    newHead = new ListNode(value);
                    temp = newHead;
                    flag = false;
                }
            }
        }
        
        return newHead;
    }

}
