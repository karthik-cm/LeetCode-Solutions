package com.leetcode.easy;

import java.util.LinkedList;

public class DesignHashSet_705 {

	public static void main(String[] args) {
		
	}

	
	private Bucket[] bucketArr;
	private int keyRange = 769;
	
	public DesignHashSet_705() {
		this.bucketArr = new Bucket[keyRange];
		
		for(int i = 0; i < keyRange; i++) {
			this.bucketArr[i] = new Bucket();
		}
	}
	
	
	
	private int _hash(int key) {
		return (key % this.keyRange);
	}
	
	public void add(int key) {
		int hashValue = this._hash(key);
		this.bucketArr[hashValue].add(key);
    }
    
    public void remove(int key) {
        int hashValue = this._hash(key);
        this.bucketArr[hashValue].remove(key);
    }
    
    public boolean contains(int key) {
    	int hashValue = this._hash(key);
    	return this.bucketArr[hashValue].contains(key);
    }
}


class Bucket {
	LinkedList<Integer> container;
	
	public Bucket() {
		this.container = new LinkedList<>();
	}
	
	public void add(Integer key) {
		int index = this.container.indexOf(key);
		if(index == -1) {
			this.container.add(key);
		}
	}
	
	public void remove(Integer key) {
		this.container.remove(key);
	}
	
	public boolean contains(Integer key) {
		int index = this.container.indexOf(key);
		return (index != -1);
	}
}