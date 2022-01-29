package com.leetcode.hard;

import java.util.PriorityQueue;

public class MergeKsortedLists_23 {

	public static void main(String[] args) {
		System.out.println();
	}
	
	
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
        	return null;
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(ListNode listNode : lists) {
        	
        	while(listNode != null) {
        		minHeap.add(listNode.val);
        		listNode = listNode.next;
        	}
        }
        
        
        if(minHeap.size() > 0) {
        	int min = minHeap.poll();
            ListNode head = new ListNode(min);
            ListNode temp = head;
            
            while(minHeap.size() > 0) {
            	int val = minHeap.poll();
            	temp.next = new ListNode(val);
            	temp = temp.next;
            }
            
            
            return head;
        }
        else {
        	return null;
        }
    }

}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
