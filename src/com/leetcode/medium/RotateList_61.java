package com.leetcode.medium;

public class RotateList_61 {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode pre = null, cur = head;
        int size = 0;
        
        while(cur != null){
            pre = cur;
            cur = cur.next;
            size++;
        }
        
        cur = head;
        pre.next = cur; // circular linked list
        
        
        int rotate = k % size;
        
        int location = size - rotate;
        
        
        for(int i=0; i<location; i++){
            pre = cur;
            cur = cur.next;
        }
        
        pre.next = null; // cut the list from location value
        
        return cur;
    }

}
