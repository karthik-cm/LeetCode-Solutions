package com.leetcode.medium;

public class RemoveNthNodeFromEndOfList_19 {

	public static void main(String[] args) {
		
	}
	
	// Slow and Fast pointers 
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(n > 0){
            fast = fast.next;
            n--;
        }
        
        if(fast == null){
            return slow.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }

}
