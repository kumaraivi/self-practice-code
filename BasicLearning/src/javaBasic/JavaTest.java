package javaBasic;


class A{
	int a=10;
	A(){
		System.out.println("Class A Constructor");
	}
}

class B extends A{
	B(){
		System.out.println("Class B Constructor");
	}
}
public class JavaTest {

	public static void main(String[] args) {
	B b=new B();
	int a=b.a;
	System.out.println(a);

	}

}
