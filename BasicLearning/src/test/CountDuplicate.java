package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountDuplicate {

	public static void main(String[] args) {
		int[] array={1,1,2,3,4,5,5,};
countDuplicate(array);

	}
public static void countDuplicate(int[] arr) {
	Set<Integer> set=new HashSet<>();
	
	for(int a:arr) {
		set.add(a);
	}
	
	Iterator<Integer> itr=set.iterator();
	
	while(itr.hasNext()) {
		int count=0;
		int a=itr.next();
		for(int ar:arr) {
			if(ar==a) {
				count++;
			}
			
		}
		System.out.println(a+" appeared "+count+" times");
	}
}
}
