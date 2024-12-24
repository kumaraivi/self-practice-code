package collections;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="Programming";
        Map<Character, Integer> charMap=mapOfCharacter(str);
        
          System.out.println("Character counts with duplicates:");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }
    
    public static Map<Character, Integer> mapOfCharacter(String str){
        
        Map<Character, Integer> mapc=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            mapc.put(c,mapc.getOrDefault(c,0)+1);
        }
        return mapc;
    }
}