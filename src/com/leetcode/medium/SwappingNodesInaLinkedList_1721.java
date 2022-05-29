package com.leetcode.medium;

public class SwappingNodesInaLinkedList_1721 {

	public static void main(String[] args) {
		
	}
	
	
	// Time Complexity : O(N)
	// Space Complexity : O(1)
	public ListNode swapNodes(ListNode head, int k) {
		int size = 0;
        ListNode node = head;
        
        // find the length of linked list
        while (node != null) {
            size++;
            node = node.next;
        }
        
        // set the front node at kth node
        ListNode frontNode = head;
        for (int i = 1; i < k; i++) {
            frontNode = frontNode.next;
        }
        
        // set the end node at (size - k)th node
        ListNode endNode = head;
        for (int i = 1; i <= size - k; i++) {
            endNode = endNode.next;
        }
        
        // swap the values of front node and end node
        int temp = frontNode.val;
        frontNode.val = endNode.val;
        endNode.val = temp;
        
        return head;
    }

}
