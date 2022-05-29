package com.leetcode.medium;

import java.util.HashMap;
import java.util.Random;

public class EncodeAndDecodeTinyUrl_535 {

	public static void main(String[] args) {
		
	}
	
	
	String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	HashMap<String, String> map = new HashMap<>();
	Random random = new Random();
	String URL = "http://tinyurl.com/";
	
	public String getRandom() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 6; i++) {
			int index = this.random.nextInt(62);
			sb.append(chars.charAt(index));
		}
		
		return sb.toString();
	}
	
	
	// Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	String key = getRandom();
    	map.put(key, longUrl);
    	return URL +key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(URL, "");
        return map.get(key);
    }

}
