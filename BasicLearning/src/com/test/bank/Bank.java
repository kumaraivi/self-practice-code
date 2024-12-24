package com.test.bank;

public interface Bank {
	
	 public static final double RATE=10;
	 public static final double MAX_LOAN_AMOUNT=2000000;
	  String name = "abcd";
	 
	 @SuppressWarnings("static-access")
	default double calculateLoanAmount() {
		 if(this.RATE==10) { 
			 System.out.println("You are eligible for max loan amount");;
		 }
		 return MAX_LOAN_AMOUNT;
		
	 }
	 
	 default double calculateLoanAmountsdsfd(int a) {
		 if(this.RATE==10) { 
			 System.out.println("You are eligible for max loan amount");;
		 }
		 return MAX_LOAN_AMOUNT;
		
	 }
	 
	 public static boolean rate() {
		return false;
		 
	 }
	

}
