package com.sample.java.practice;
class A{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class Simple extends A{  
protected void msg(){System.out.println("Hello java Hi");}//C.T.Error  
 public static void main(String args[]){  
   Simple obj=new Simple();  
   obj.msg();  
   }  
}  