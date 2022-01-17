package com.leetcode.medium;

public class ReorderList_143 {
	// Given : 1 -> 2 -> 3 -> 4 -> 5 -> 6
	// Aim   : 1 -> 6 -> 2 -> 5 -> 3 -> 4
	
	// Solution :
	// Split the list to two halves - l1, l2
	// Reverse the list l2
	// merge l1 and l2
	

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		ListNode curr = first;
		ListNode head = curr;
		
		curr.next = second;
		curr = curr.next;
		
		curr.next = third;
		curr = curr.next;
		
		curr.next = fourth;
		
		
		
		// reorderList(head);
		
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
        	return;
        }
        
        ListNode mid = findMiddle(head);
        ListNode tailNode = reverse(mid);
        reorder(head, tailNode);
    }
    
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; // this will split the list into two halfs
        return slow;
    }
    
    ListNode reverse(ListNode mid){
        ListNode prev = null;
        ListNode curr = mid;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    void reorder(ListNode startNode1, ListNode startNode2){
        while(startNode1 != null && startNode2 != null){
            ListNode tempStartNode1 = startNode1.next;
            ListNode tempStartNode2 = startNode2.next;
            
            startNode1.next = startNode2;
            
            if(tempStartNode1 == null && tempStartNode2 != null) {
            	return; // handle the case when there are odd numbers, it depends on findMiddle implementation
            }
            
            startNode2.next = tempStartNode1;
            
            startNode1 = tempStartNode1;
            startNode2 = tempStartNode2;
        }
    }
	
	
	
	
	/*public static void reorderList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        boolean takeFirstNodeflag = false;
        head = null;
        head = new ListNode(list.getFirst());
        ListNode temp = head;
        list.removeFirst();
        
        while(list.size() > 0){
            if(takeFirstNodeflag){
                int firstVal = list.getFirst();
                temp.next = new ListNode(firstVal);
                takeFirstNodeflag = false;
                list.removeFirst();
            }
            else{
                int lastVal = list.getLast();
                temp.next = new ListNode(lastVal);
                takeFirstNodeflag = true;
                list.removeLast();
            }
            temp = temp.next;
        }
        
        System.out.println("Final answer");
        while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
        System.out.println("--Ends--");
    }*/
}

class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) {
		this.val = val;
	}
	
	ListNode(int val, ListNode next) {
		this.val = val; this.next = next;
	}
}