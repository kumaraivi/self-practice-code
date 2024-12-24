package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArraysContainsSameElements {

	public static void main(String[] args) {
		Integer[] arr1= {1,2,3,4,5,1};
		Integer[] arr2= {1,2,3,4,5};
		Integer[] arr3= {1,2,3,4};
		
		System.out.println(twoArraysContainsSameElements(arr1,arr2));
		System.out.println(twoArraysContainsSameElements(arr1,arr3));

	}

	private static boolean twoArraysContainsSameElements(Integer[] arr1, Integer[] arr2) {
		Set<Integer> set1=new HashSet<>(Arrays.asList(arr1));
		Set<Integer> set2=new HashSet<>(Arrays.asList(arr2));
		
		if(set1.size()!=set2.size()) return false;
		
		for(Object a:set1) {
			if(!set2.contains(a)) return false;
		}
		
		return true;
	}

}
