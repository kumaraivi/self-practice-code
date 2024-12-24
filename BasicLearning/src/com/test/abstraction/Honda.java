package com.test.abstraction;

public class Honda extends Vehicle {

	public Honda(int wheel, String vehicleType, double speed) {
		super(wheel, vehicleType, speed);
		
		// TODO Auto-generated constructor stub
	}
	

	@Override
	void main(int a) {
		// TODO Auto-generated method stub
		if(vehicleType.equals("Honda")) {
		this.speed=a;
		System.out.println("Speed of "+vehicleType+" is "+a);
		}

	}

}
