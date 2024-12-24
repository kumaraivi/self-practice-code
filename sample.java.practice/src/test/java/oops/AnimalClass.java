package oops;

 public abstract class AnimalClass {
	 String name;
	 
	 int age;
	 
	public AnimalClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	abstract public void numberOfLegs();
	
	
	public final static void eat() {
		System.out.println("Animals eat grass");
	}
	public void eat(String name) {
		System.out.println("Animals eat grass"+name);
	}
}
