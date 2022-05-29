package com.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashMap_706 {

	public static void main(String[] args) {
		
	}
	
	
	
	private List<Bucket2> hash_table;
	private int key_space;

	public DesignHashMap_706() {
		this.key_space = 2069;
		this.hash_table = new ArrayList<>();
		
		for (int i = 0; i < this.key_space; ++i) {
			this.hash_table.add(new Bucket2());
		}
	}

	
	public void put(int key, int value) {
		int hash_key = key % this.key_space;
		this.hash_table.get(hash_key).put(key, value);
	}

	public int get(int key) {
		int hash_key = key % this.key_space;
		return this.hash_table.get(hash_key).get(key);
	}

	public void remove(int key) {
		int hash_key = key % this.key_space;
		this.hash_table.get(hash_key).remove(key);
	}

}


class Pair<U, V> {
	public U first;
	public V second;

	public Pair(U first, V second) {
		this.first = first;
		this.second = second;
	}
}


class Bucket2 {
	private List<Pair<Integer, Integer>> bucket;

	public Bucket2() {
		this.bucket = new LinkedList<>();
	}

	public Integer get(Integer key) {
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.first.equals(key)) {
				return pair.second;
			}
		}
		
		return -1;
	}

	public void put(Integer key, Integer value) {
		boolean found = false;
		
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.first.equals(key)) {
				pair.second = value;
				found = true;
			}
		}
		
		if (!found) {
			this.bucket.add(new Pair<Integer, Integer>(key, value));
		}
	}

	public void remove(Integer key) {
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.first.equals(key)) {
				this.bucket.remove(pair);
				break;
			}
		}
	}
}
