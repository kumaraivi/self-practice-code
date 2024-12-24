package practice;

public class MethodOverloading {
	
	public static void test1() {
		
		System.out.println("MethodOverloading");
		
	}
    static void test1(int a) {
    	System.out.println("MethodOverloading "+a);
	}
    
    static void test2(int a) {
    	System.out.println("MethodOverloading "+a);
	}
    
   final static void test2(int a, int b) {
	   System.out.println("MethodOverloading "+a+b);
	}
   
   private  void test3(int a, int b) {
	   System.out.println("MethodOverloading "+a+b);
	}
   private  void test3(int a, int b, int c) {
	   System.out.println("MethodOverloading "+a+b+c);
	}
   
   public static void main(String args[]) {
	   MethodOverridding mo=new MethodOverridding();
	   MethodOverridding.test2(0);
	   MethodOverridding.test1();
	   MethodOverridding.test1(1);
	   MethodOverloading.test2(1,1);
	   
   }
}

 class MethodOverridding extends MethodOverloading{
	 
	 public static void test1() {
			
			System.out.println("MethodOverridding");
			
		}
	 
	 static void test1(int a) {
	    	System.out.println("MethodOverridding "+a);
		}
	 
	 final static void test2(int a) {
	    	System.out.println("MethodOverridding "+a);
		}
	 
	 private  void test3(int a, int b) {
		 int s=a+b;
		   System.out.println("MethodOverridding "+s);
		}
	
}
