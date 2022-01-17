package com.leetcode.medium;

import java.util.Iterator;
import java.util.LinkedList;

public class OddEvenLinkedList_328 {

	public static void main(String[] args) {
		
	}
	
	public ListNode oddEvenList(ListNode head) {
        LinkedList<Integer> oddList = new LinkedList<>();
        LinkedList<Integer> evenList = new LinkedList<>();
        boolean isOdd = true;
        
        while(head != null){
            if(isOdd){
                oddList.add(head.val);
                isOdd = false;
            }
            else{
                evenList.add(head.val);
                isOdd = true;
            }
            
            head = head.next;
        }
        
        ListNode finalNode = null;
        Iterator<Integer> itr = evenList.descendingIterator();
        while(itr.hasNext()){
            finalNode = new ListNode(itr.next(), finalNode);
        }
        
        itr = oddList.descendingIterator();
        while(itr.hasNext()){
            finalNode = new ListNode(itr.next(), finalNode);
        }
        
        return finalNode;
    }

}
