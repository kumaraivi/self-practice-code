package com.sample.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Selftest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Avinash");
		checkLastCharOfString(list);
	}

	public static void checkLastCharOfString(List<String> list){
		    Iterator<String> itr=list.iterator();
		    while(itr.hasNext()){
		    String str=itr.next();
		    System.out.println(str.charAt(str.length()-1));
		   }
	}
	
}
		    
		    
