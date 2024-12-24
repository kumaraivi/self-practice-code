package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class illustrateTryCatchBlock {
	
	public static void main(String args[]) {
		
    String str=null;
    String filePath="/Users/avinashkumar/eclipse-workspace/BasicLearning/src/practice/text.txt";
    
    System.out.println(findStringInFile(filePath, str));

}

	private static boolean findStringInFile(String filePath, String str) {
		   boolean boo=false;

			FileInputStream fis = null;
			try {
				fis = new FileInputStream(filePath);
			} catch (IllegalArgumentException | NullPointerException | FileNotFoundException e) {
				e.printStackTrace();
			}
	
		Scanner sc=new Scanner(fis);
		while(sc.hasNextLine()) {
			String nextLine=sc.nextLine();
			if(nextLine.contains(str)) {
				boo=true;
				break;
			}
		}
		return boo;
	}
	
}
