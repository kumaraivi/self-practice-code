package generic;

import java.util.List;

//Generic Class

//Usage
public class Main {
 public static void main(String[] args) {
     Box<String> stringBox = new Box<>();
     stringBox.setItem("Hello");
     System.out.println(stringBox.getItem());

     Box<Integer> intBox = new Box<>();
     intBox.setItem(123);
     System.out.println(intBox.getItem());
     
     Calculator<Integer> intCalc = new Calculator<>();
     System.out.println(intCalc.add(10, 20));

     Calculator<Double> doubleCalc = new Calculator<>();
     System.out.println(doubleCalc.add(10.5, 20.5));
     
     
     Pair<String, Integer> pair = new OrderedPair<>("Age", 30);
     System.out.println(pair.getKey() + ": " + pair.getValue());
     
     List<Integer> intList = List.of(1, 2, 3);
     List<String> stringList = List.of("A", "B", "C");

     WildcardExample.printList(intList);
     System.out.println();
     WildcardExample.printList(stringList);   
 }
}
