package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FindStringInFile {

	public static void main(String[] args) throws FileNotFoundException {
		String path="/Users/avinashkumar/eclipse-workspace/BasicLearning/src/practice/text.doc";
		String text="ides";
		System.out.println(findStringInFile(path, text));

	}

	@SuppressWarnings("resource")
	private static  boolean findStringInFile(String path, String text) throws FileNotFoundException {
		boolean boo=false;
		File file=new File(path);
		FileInputStream files=new FileInputStream(file);
		Scanner sc=new Scanner(files);
		
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			if(line.contains(text)) {
				boo=true;
			}
		}
		return boo;
	}

}
