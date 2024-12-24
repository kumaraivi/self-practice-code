package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(5, "Avinash");
		map.put(3, "Rakesh");
		map.put(2, "Vijay");
		map.put(4, "Sumit");
		map.put(1, "Pankaj");
		
		System.out.println(map);

		map = sortByValue(map);

		System.out.println(map);
	}

	private static Map<Integer,  String> sortByValue(Map<Integer, String> map) {
		Map<Integer, String> sortedByValue = new LinkedHashMap<>();

		// get the entry set
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println("Set: "+entrySet);

		// create a list since the set is unordered
		List<Entry<Integer, String>> entryList = new ArrayList<>(entrySet);
		System.out.println("List: "+entryList);

		// sort the list by value
		entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println("Sorted List: "+entryList);

		// populate the new hash map
		for (Entry<Integer, String> e : entryList)
			sortedByValue.put(e.getKey(), e.getValue());

		return sortedByValue;
	}

}