package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateInSpecificFormat {

	public static void main(String[] args) {
		
		String format="dd";
		
     System.out.println(printDateInSpecificFormat(format));

	}

	private static String printDateInSpecificFormat(String format) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
		String date=simpleDateFormat.format(new Date());
		return date;
	}

}
