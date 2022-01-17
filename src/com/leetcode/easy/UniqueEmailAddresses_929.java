package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {

	public static void main(String[] args) {
		// String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
		
		System.out.println(numUniqueEmails(emails));
	}
	
	
	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		
		for(String email : emails) {
			String local = email.split("@")[0];
			String domain = email.split("@")[1];
			
			// .
			local = local.replace(".", "");
			
			// +
			int i = 0;
			for(i=0; i<local.length(); i++) {
				if(local.charAt(i) == '+') {
					break;
				}
			}
			
			local = local.substring(0, i);
			
			
			set.add(local+"@"+domain);
		}
		
		
		System.out.println(set);
		
		return set.size();
    }

}
