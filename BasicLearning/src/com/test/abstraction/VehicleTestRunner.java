package com.test.abstraction;

public class VehicleTestRunner {

	public static void main(String[] args) {
		
		Vehicle vc=new Honda(2, "Hond", 200);
		System.out.println(vc.speed+" "+vc.vehicleType+" "+vc.wheel);
		Vehicle.main();
		vc.main(150);

	}

}
