package com.java.collection;

import java.util.Hashtable;

public class HashTableTest {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		

		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(1, "a");
		ht.put(2, null);
		
		System.out.println(ht.get(2));

	}

}
