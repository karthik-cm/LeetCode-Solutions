package com.leetcode.medium;

public class RemoveDuplicatesFromSortedListII_82 {

	public static void main(String[] args) {
		
	}
	
	// TC - O(N)
	// SC - O(1)
	public ListNode deleteDuplicates(ListNode head) {
		// sentinel
	    ListNode sentinel = new ListNode(0, head);
	
	    // predecessor = the last node before the sublist of duplicates
	    ListNode pred = sentinel;
	    
	    while (head != null) {
	        // if it's a beginning of duplicates sublist - skip all duplicates
	        if (head.next != null && head.val == head.next.val) {
	            
	        	// move till the end of duplicates sublist
	            while (head.next != null && head.val == head.next.val) {
	                head = head.next;
	            }
	            
	            // skip all duplicates
	            pred.next = head.next;
	        } 
	        else {
	        	// otherwise, move predecessor
	            pred = pred.next;
	        }
	            
	        // move forward
	        head = head.next;  
	    }
	    
	    return sentinel.next;
	}
	
	
	// TC - O(N)
	// SC - O(N)
	/*public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new TreeMap<>();
        while(head != null){
            map.put(head.val, map.getOrDefault(head.val, 0)+1);
            head = head.next;
        }
        
        ListNode newHead = null, temp = null;
        boolean flag = true;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                int value = entry.getKey();
                
                if(!flag){
                    temp.next = new ListNode(value);
                    temp = temp.next;
                }
                else{
                    newHead = new ListNode(value);
                    temp = newHead;
                    flag = false;
                }
            }
        }
        
        return newHead;
    }*/

}
