package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists_160 {

	public static void main(String[] args) {
		
	}
	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodesInB = new HashSet<>();

        while (headB != null) {
            nodesInB.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            // if we find the node pointed to by headA,
            // in our set containing nodes of B, then return the node
            if (nodesInB.contains(headA)) {
                return headA;
            }
            
            headA = headA.next;
        }

        return null;
    }
	
	
	/*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode a = headA, b = headB;
        
        while(a != b){
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        
        return a;
    }*/

}
