package com.leetcode.easy;

public class DefangIpAddress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String defangedAddress = address.replace(".", "[.]");
		System.out.println(defangedAddress);
	}

}
