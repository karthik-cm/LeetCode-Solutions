package com.leetcode.easy;

import java.util.Map;

import static java.util.Map.entry;

public class ReformatDate_1507 {

	public static void main(String[] args) {
		String date = "26th May 1960";
		
		System.out.println(reformatDate(date));
	}
	
	
	public static String reformatDate(String date) {
		String dateArr[] = date.split(" ");
		
		Map<String, String> monthMap = Map.ofEntries(entry("Jan", "01"), entry("Feb", "02"), entry("Mar", "03"), entry("Apr", "04"), entry("May", "05"), entry("Jun", "06"), entry("Jul", "07"), entry("Aug", "08"), entry("Sep", "09"), entry("Oct", "10"), entry("Nov", "11"), entry("Dec", "12"));
		
		String dayStr = dateArr[0].trim();
		String monthStr = dateArr[1].trim();
		String year = dateArr[2].trim();
		
		
		String day = "";
		for(char c : dayStr.toCharArray()) {
			if(Character.isDigit(c)) {
				day += c;
			}
			else {
				break;
			}
		}
		
		day = (day.length() == 1) ? "0"+day : day;
		
		String month = monthMap.get(monthStr);
		
		return year +"-" +month +"-" +day;
    }
}
