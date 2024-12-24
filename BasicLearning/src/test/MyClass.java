package test;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
      List<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(12);
      list.add(5);
      list.add(6);
      
for(int e:list){
      System.out.print(+e+" ");
      
}
System.out.println();
reve(list);
    }
    
    public static void reve(List<Integer> list) {
    	List<Integer> revList=new ArrayList<Integer>();
    	for(int i=list.size()-1;i>=0;i--) {
    		revList.add(list.get(i));
    	}
    	
    	for(int e:revList) {
    		System.out.print(+e+" ");
    	}
    }
}