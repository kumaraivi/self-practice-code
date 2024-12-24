package test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class countCharacters {

	public static void main(String[] args) {
		

		String name="Avinash Kumar";
		
		char[] charArray=name.toCharArray();
		
		Set<Character> set=new HashSet<>();
		
		for(int i=0;i<charArray.length;i++) {
			set.add(charArray[i]);
		}
		
		Iterator<Character> itr=set.iterator();
		
		while(itr.hasNext()) {
			char newstr=itr.next();
			
			int count=0;
			for(int j=0;j<charArray.length;j++) {
				char strC=charArray[j];
				if(newstr==strC) {
					count++;
				}
			}
			System.out.println("count of character "+newstr+" is "+count+".");
			
		}
	}

}
