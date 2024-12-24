package practice;

public class EnumTest {
	
	public static enum DAYS{Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday;}

	public static void main(String[] args) {
		todayIs(1);
		todayIs(2);
		todayIs(3);
		todayIs(4);
		todayIs(5);
		todayIs(6);
		todayIs(7);
		todayIs(10);

	}
	
	public static void todayIs(int value) {
		
		
		switch(value) {
		case 1: System.out.println("Today is "+DAYS.Sunday); break;
		case 2: System.out.println("Today is "+DAYS.Monday); break;
		case 3: System.out.println("Today is "+DAYS.Tuesday); break;
		case 4: System.out.println("Today is "+DAYS.Wednesday); break;
		case 5: System.out.println("Today is "+DAYS.Thrusday); break;
		case 6: System.out.println("Today is "+DAYS.Friday); break;
		case 7: System.out.println("Today is "+DAYS.Saturday); break;
		default: System.out.println("Invalid Key"); break;
		
		}
	}

}
