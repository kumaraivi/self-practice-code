package oops;

public class IndianTraffic implements USTraffic{

	@Override
	public void redlight() {
		System.out.println("Red Light");
		
	}

	@Override
	public void greenlight() {
		System.out.println("Green Light");
		
	}

	@Override
	public void yellowlight() {
		System.out.println("Yellow Light");
		
	}
	
	public void blacklight() {
		System.out.println("Black Light");
	}

}
