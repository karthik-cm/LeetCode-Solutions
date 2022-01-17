package com.leetcode.easy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetDayOfTheWeek_1185 {

	public static void main(String[] args) {
		int year = 2021, month = 4, dayOfMonth = 4;
		
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		DayOfWeek dow = date.getDayOfWeek();
		String dayOfWeek = dow.getDisplayName(TextStyle.FULL, Locale.US);
		
		System.out.println(dayOfWeek);
	}

}
