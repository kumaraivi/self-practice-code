package test2;
class Car {
   public void brake() {
      System.out.println("brake() method of Car");
   }
   public final void accelerate() {
      System.out.println("accelerate() method of Car");
   }
   public void accelerate(double ik) {
	      System.out.println("accelerate() method of Car");
	   }
   public static void accelerate(int i, int j) {
	      System.out.println("accelerate() method of Car");
	   }
   
   public static void accelerate(int i) {
	      System.out.println("accelerate() method of Car");
	   }
}
public class BenzCar extends Car {
  
   public void accelerate(double ik) {
      System.out.println("accelerate() method of Benz Car");
   }
   public static void accelerate(int i) {
	      System.out.println("accelerate() method of Benz Car");
	   }
   
   public static void main(String[] args) {
	      Car benz = new BenzCar();
	      benz.accelerate(10);
	      benz.brake();
	      benz.accelerate(20.12);
	   }
}