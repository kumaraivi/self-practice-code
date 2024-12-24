package com.test.abstraction;

  abstract class Vehicle {
	 
	 int wheel;
	 String vehicleType;
	 double speed;
	 
	 public Vehicle(int wheel, String vehicleType, double speed){
		 this.wheel=wheel;
		 this.vehicleType=vehicleType;
		 this.speed=speed;
	 }
	 
	  abstract void main(int a);
	 
	 public static void main() {
		 System.out.println("Testing");
	 }

}
