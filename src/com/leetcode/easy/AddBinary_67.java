package com.leetcode.easy;

import java.math.BigInteger;

public class AddBinary_67 {

	public static void main(String[] args) {
		String a = "1010"; // 10
		String b = "1011"; // 11
		System.out.println(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
		BigInteger ba = new BigInteger(a, 2); // a = "1011"
		BigInteger bb = new BigInteger(b, 2); // b = "1010"
		return ba.add(bb).toString(2);
    }
}
