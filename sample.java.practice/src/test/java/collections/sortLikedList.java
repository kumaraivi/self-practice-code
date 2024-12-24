package collections;

import java.util.LinkedList;
import java.util.List;

public class sortLikedList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(5);
		printReverseLinkedList(list);
	}
	
	public static void printReverseLinkedList(LinkedList<Integer> list)
	{
		
		System.out.println(list);
		
		LinkedList<Integer> list1=new LinkedList<>();
		list.descendingIterator().forEachRemaining(list1::add);
		System.out.println(list1);
	}
}
