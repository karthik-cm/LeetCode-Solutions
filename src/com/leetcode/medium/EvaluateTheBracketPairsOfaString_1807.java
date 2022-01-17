package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvaluateTheBracketPairsOfaString_1807 {

	public static void main(String[] args) {
		String s = "(name)is(age)yearsold";
		
		List<List<String>> knowledge = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		list.add("name");
		list.add("bob");
		
		knowledge.add(list);
		
		list = new ArrayList<>();
		list.add("age");
		list.add("two");
		
		knowledge.add(list);
		
		
		
		System.out.println(evaluate(s, knowledge));
	}
	
	public static String evaluate(String s, List<List<String>> knowledge) {
		StringBuilder sb=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
       
        for(List<String> list : knowledge){
        	map.put(list.get(0),list.get(1));    
        }
        
        int i=0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '('){
                i++; // we are at '(' to move to next character
                StringBuilder key = new StringBuilder();
                
                while(i < s.length() && s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }
                
                sb.append(map.containsKey(key.toString())? map.get(key.toString()) : "?");
                i++; // we are at ')' to move to next character
                continue;
            }
            
            sb.append(c);    
            i++;
        }
        
        return sb.toString();
    }
	
	
	/*public static String evaluate(String s, List<List<String>> knowledge) {
		Map<String, String> map = new HashMap<>();
		
		for(List<String> list : knowledge) {
			map.put(list.get(0), list.get(1));
		}
		
		boolean start = false;
		String str = "";
		String ans = "";
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' && !start) {
				start = true;
			}
			else if(c == ')') {
				if(map.containsKey(str)) {
					ans += map.get(str);
				}
				else {
					ans += "?";
				}
				start = false;;
				str = "";
			}
			else {
				if(start) {
					str += c;
				}
				else {
					ans += c;
				}
			}
		}
		
		return ans;
    }*/

}
