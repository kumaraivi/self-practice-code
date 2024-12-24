package com.sample.java.practice;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void TypeInField(String xpath, String value){
	    String val = value; 
	    //WebElement element = driver.findElement(By.xpath(xpath));
	    //element.clear();

	    for (int i = 0; i < val.length(); i++){
	        char c = val.charAt(i);
	        String s = new StringBuilder().append(c).toString();
	        System.out.println(s);
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }       
	}
}
