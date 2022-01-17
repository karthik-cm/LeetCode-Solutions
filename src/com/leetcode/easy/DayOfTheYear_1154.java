package com.leetcode.easy;

public class DayOfTheYear_1154 {

	public static void main(String[] args) {
		// String date = "2019-01-09";
		// String date = "2019-02-10";
		String date = "2008-10-10";
		
		System.out.println(dayOfYear(date));
	}
	
	
	public static int dayOfYear(String date) {
		int count = 0;
		String dateArr[] = date.split("-");
        
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        
        for(int i=1; i<=month; i++) {
        	if(i == month) {
        		count += day;
        	}
        	else {
                if(i == 2){
                	// boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
                	boolean isLeapYear = ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)); 
                	count += (isLeapYear) ? 29 : 28;
                }
        		else if(i <= 7) {
        			count += (i%2==1) ? 31 : 30;
        		}
        		else {
        			count += (i%2==0) ? 31 : 30;
        		}
        	}
        }
        
        return count;
    }

}
