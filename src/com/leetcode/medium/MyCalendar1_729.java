package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar1_729 {	
	
	List<int[]> calendar;
    
    public MyCalendar1_729() {
        calendar = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] date : calendar){
            if(date[0] < end && date[1] > start){
                return false;
            }
        }
        
        calendar.add(new int[] {start, end});
        return true;
    }

}
