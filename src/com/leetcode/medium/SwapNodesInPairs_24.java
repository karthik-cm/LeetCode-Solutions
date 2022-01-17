package com.leetcode.medium;

public class SwapNodesInPairs_24 {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        
        if(head.next == null){
            return head;
        }
        
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        
        return temp;
    }

}
