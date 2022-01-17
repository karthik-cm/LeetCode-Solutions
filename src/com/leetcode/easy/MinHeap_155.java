package com.leetcode.easy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MinHeap_155 {

	public static void main(String[] args) {
		
	}	

}

class MinStack {
    Stack<Integer> stack;
    Queue<Integer> minHeap;
    
    public MinStack() {
        stack = new Stack<>();
        minHeap = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);
        minHeap.add(val);
    }
    
    public void pop() {
    	int element = stack.pop();
        minHeap.remove(element);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}