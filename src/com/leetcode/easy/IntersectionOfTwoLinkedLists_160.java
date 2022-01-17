package com.leetcode.easy;

public class IntersectionOfTwoLinkedLists_160 {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode a = headA, b = headB;
        
        while(a != b){
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        
        return a;
    }

}
