package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class Dota2Senate_649 {
	private static final String RADIANT_SENATOR = "R";
	private static final String DIRE_SENATOR = "D";

	public static void main(String[] args) {
		String senators = "DRDRR";
		predictVictory(senators);
	}

	
	public static void predictVictory(String senators) {
		// int radiantSenatorsCount = (int) senators.chars().filter(s -> s == 'R').count();
		// int direSenatorsCount = senators.length() - radiantSenatorsCount;
		// List<String> senateList = Arrays.asList(senateArr);
		
		List<String> senateList = new LinkedList<String>();
		String[] senateArr = senators.split("");
		for(String s : senateArr) {
			senateList.add(s);
		}
		System.out.println("Initial: "+senateList);
		
		String lastSenator = null;
		int i = 0, radCount = 0, dirCount = 0;
		while(senateList.size() != 1) {
			int radiantSenatorsCount = (int) senateList.stream().filter(s -> s.equalsIgnoreCase(RADIANT_SENATOR)).count();
			int direSenatorsCount = (int) senateList.stream().count() - radiantSenatorsCount;
			
			if(radiantSenatorsCount == senateList.size()) {
				senateList.clear();
				senateList.add(RADIANT_SENATOR);
			}
			else if(direSenatorsCount == senateList.size()) {
				senateList.clear();
				senateList.add(DIRE_SENATOR);
			}
			else if(i <= senateList.size()-1){
				if(senateList.get(i).equalsIgnoreCase(RADIANT_SENATOR)) {
					if(dirCount>0 || lastSenator != null && lastSenator.equalsIgnoreCase(DIRE_SENATOR)) {
						senateList.remove(i);
						dirCount--;
					}
					else {
						radCount++;
					}
					lastSenator = RADIANT_SENATOR;
				}
				else {
					if(radCount>0 || lastSenator != null && lastSenator.equalsIgnoreCase(RADIANT_SENATOR)) {
						senateList.remove(i);
						radCount--;
					}
					else {
						dirCount++;
					}
					lastSenator = DIRE_SENATOR;
				}
				i++;
			}
			else {
				i = 0;
			}
		}
		
		System.out.println("Final: "+senateList);
		String winner = senateList.get(0).equalsIgnoreCase(RADIANT_SENATOR) ? "Radiant" : "Dire";
		System.out.println("Winner = "+winner);
	}
	
	
	
	
	/*while(senateList.size() != 1) {
		int radiantSenatorsCount = (int) senateList.stream().filter(s -> s.equalsIgnoreCase(RADIANT_SENATOR)).count();
		int direSenatorsCount = (int) senateList.stream().count() - radiantSenatorsCount;
		
		if(radiantSenatorsCount == senateList.size()) {
			senateList.clear();
			senateList.add(RADIANT_SENATOR);
		}
		else if(direSenatorsCount == senateList.size()) {
			senateList.clear();
			senateList.add(DIRE_SENATOR);
		}
		else if(i <= senateList.size()-1){
			if(senateList.get(i).equalsIgnoreCase(RADIANT_SENATOR)) {
				if(lastSenator != null && lastSenator.equalsIgnoreCase(DIRE_SENATOR)) {
					senateList.remove(i);
				}
				lastSenator = RADIANT_SENATOR;
			}
			else {
				if(lastSenator != null && lastSenator.equalsIgnoreCase(RADIANT_SENATOR)) {
					senateList.remove(i);
				}
				lastSenator = DIRE_SENATOR;
			}
			i++;
		}
		else {
			i = 0;
		}
	}*/
	
}
