package practice;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharAndCountInString {

	public static void main(String[] args) {
		String str="aaaaaAAAAAA bbbbbbbb,,,,,,,     sssss";
		distinctCharAndCountInString(str);

	}

	private static void distinctCharAndCountInString(String str) {
		//str=str.toLowerCase();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
		}
		for(Character c:set) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)== c) {
					count++;
				}
			}
			System.out.println("Distinct Character is "+c+" and it count is "+count);
			
		}
		
	}

}
