package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {
	 public static void main(String[] args) throws FileNotFoundException {
		 
		 File file=new File("//Users/avinashkumar/eclipse-workspace/sample.java.practice/src/test/java/test/text");
		 
		 Scanner sc=new Scanner(file);
		 
		 while(sc.hasNextLine()) {
			 String str=sc.nextLine();
			 if(str.contains("Ra")) {
				 System.out.print("Text file has given text");
				 break;
			 }
		 }
		 System.out.print("Text file has not given text");
		 sc.close();
	 }
}

