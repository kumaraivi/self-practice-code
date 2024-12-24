package com.test.bank;

public class TestHDFC {

	public static void main(String[] args) {
		
		
		Bank hdfc=new HDFC();
		
		System.out.println(hdfc.calculateLoanAmount()+" "+Bank.rate()+ " "+hdfc.MAX_LOAN_AMOUNT+" "+hdfc.RATE+" "+hdfc.name.toUpperCase());
		
		System.out.print(Bank.rate());

	}

}
