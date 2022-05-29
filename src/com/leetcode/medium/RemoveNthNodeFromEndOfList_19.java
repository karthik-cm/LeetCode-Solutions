package com.leetcode.medium;

public class RemoveNthNodeFromEndOfList_19 {

	public static void main(String[] args) {
		
	}
	
	
	// Two pass algorithm
	// T.C = O(N)
	// S.C = O(1)
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(-1); // sentinel
        dummy.next = head;
        
        int size = 0;
        ListNode first = head;
        while(first != null){
            size++;
            first = first.next;
        }
        
        int k = size - n;
        ListNode node = dummy;
        while(k > 0){
            node = node.next;
            k--;
        }
        
        // here 'node' is previous node of the to be deleted node
        node.next = node.next.next;
        
        return dummy.next;
	}
	
	
	
	// One Pass
	// Slow and Fast pointers 
	/*public ListNode removeNthFromEnd(ListNode head, int n) {
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
    }*/

}
