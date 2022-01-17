package com.leetcode.medium;

public class AddTwoNumbers_2 {
	
	public static void main(String[] args) {
		
	}
	
	
	int carry = 0;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	// l1 = 2,4,3
    	// l2 = 5,6,4
    	
    	// Base condition
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        
        int value1 = (l1 == null) ? 0 : l1.val;
        int value2 = (l2 == null) ? 0 : l2.val;
        
        int sum = value1 + value2 + carry;
        carry = sum/10;
        
        l1 = (l1 == null) ? null : l1.next;
        l2 = (l2 == null) ? null : l2.next;
        
        ListNode finalListNode = new ListNode(sum%10, addTwoNumbers(l1, l2));
        
        return finalListNode;
    }
}
