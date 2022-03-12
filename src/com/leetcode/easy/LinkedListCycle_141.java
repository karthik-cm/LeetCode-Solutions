package com.leetcode.easy;

public class LinkedListCycle_141 {

	public static void main(String[] args) {
		
	}
	
	
	// TC - SC - O(N)
	/*public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        while(head != null) {
        	if(set.contains(head)) {
        		return true;
        	}
        	
        	set.add(head);
        	
        	head = head.next;
        }
        
        return false;
    }*/
	
	
	public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }

}
