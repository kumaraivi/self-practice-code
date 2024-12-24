package practice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("abc");
		List<String> list2=new ArrayList<>();
		list1.add("def");
		System.out.println(mergedList(list1, list2));
	}

	private static List<String> mergedList(List<String> list1, List<String> list2) {
		List<String> mergedList=new ArrayList<>(list1);
		mergedList.addAll(list2);
		return mergedList;
	}

}
