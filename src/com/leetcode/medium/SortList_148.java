package com.leetcode.medium;

public class SortList_148 {

	public static void main(String[] args) {
		
	}
	
	
	// Top Down Merge Sort Approach
	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    
    // Fast & Slow pointers
    // 1,2,3,4,5
    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        
        while(head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        
        ListNode mid = midPrev.next;
        midPrev.next = null;
        
        return mid;
    }
	
	
	
	/*public static ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        
        List<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        // Collections.sort(list);
        int arr[] = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);
        
        
        ListNode newHead = new ListNode(arr[0]);
        ListNode temp = newHead;
        
        for(int i=1; i<arr.length; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        
        return newHead;
    }*/

}
