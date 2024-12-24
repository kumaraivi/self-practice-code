package oops;

public class CowClass extends AnimalClass  {




	public CowClass(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void numberOfLegs() {
		
       System.out.println("Cows have 4 legs");
		
	}
	
	public static void eat(int age) {
		System.out.println("All Animals eat grass"+age);
	}
	

	public static void main(String[] args) {
		AnimalClass animal=new CowClass("Honey", 0);
		animal.numberOfLegs();
		AnimalClass.eat();
		animal.eat("Honey");
		System.out.println(animal.name);
		CowClass  cow=new CowClass(null, 0);
		System.out.println(cow.name);
		CowClass.eat();
	}

}
