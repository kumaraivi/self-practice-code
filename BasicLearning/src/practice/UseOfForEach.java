package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfForEach {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Avinash");
		list.add("Akshra");
		list.add("Akshainie");
		list.add("Atharv");
		list.add("Khushbu");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		list.forEach(s ->System.out.print(s+" "));
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Aaron");
		array.add("N.");
		array.add("Brock");
        
		System.out.println();
		
		array.stream().forEach((s) -> System.out.print(s + " "));
	}

}
