package com.leetcode.easy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class NoOfStudentsUnableToEatLunch_1700 {

	public static void main(String[] args) {
		int students[] = {1,1,1,0,0,1};
		int sandwiches[] = {1,0,0,0,1,1};
		
		System.out.println(countStudents(students, sandwiches));
	}
	
	
	public static int countStudents(int[] students, int[] sandwiches) {
		LinkedList<Integer> stStack = new LinkedList<>();
		Stack<Integer> saStack = new Stack<>();

		for(int i=students.length-1; i>=0; i--) {
			stStack.push(students[i]);
		}
		
		for(int i=sandwiches.length-1; i>=0; i--) {
			saStack.push(sandwiches[i]);
		}
		
		System.out.println(stStack);
		System.out.println(saStack);
		
		boolean flag = topSandwichCondition(stStack, saStack);
		while(flag) {
			if(stStack.peek() == saStack.peek()) {
				stStack.pop();
				saStack.pop();
			}
			else{
				int student = stStack.pop();
				stStack.addLast(student);
			}
			
			flag = topSandwichCondition(stStack, saStack);
		}
		
		return stStack.size();
    }
	
	
	private static boolean topSandwichCondition(LinkedList<Integer> stStack, Stack<Integer> saStack) {
		if(stStack != null && stStack.size() > 0 && saStack != null && saStack.size() > 0) {
			Iterator<Integer> itr = stStack.iterator();
			int topSandwich = saStack.peek();
			
			while(itr.hasNext()) {
				
				if(itr.next() == topSandwich) {
					return true;
				}
			}
			
			return false;
		}
		
		return false;
	}

}
