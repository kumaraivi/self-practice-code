package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		reversedList(list);

	}

	private static void reversedList(LinkedList<Integer> list) {
		LinkedList<Integer> list1=new LinkedList<>();
		LinkedList<Integer> list2=new LinkedList<>();
		LinkedList<Integer> list3=new LinkedList<>();
		Set<Integer> set=new HashSet<>();
		for(int i=list.size()-1;i>=0;i--) {
			list1.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(list1);
		list.descendingIterator().forEachRemaining(list2::add);
		System.out.println(list2);
		for(int l:list) {
			set.add(l);
		}
		System.out.println(set);
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			list3.add(it.next());
		}
		LinkedList<Integer> list4=new LinkedList<>();
		list3.descendingIterator().forEachRemaining(list4::add);
		System.out.println(list4);
	}
	
}
