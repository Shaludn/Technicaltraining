package Assignment1;

public class methodoverload {
	static void interest() {
		System.out.println("The govt banks add lot of interests on loan");
		
	}
	static int interest(int rate) {
		System.out.println("the rate of interest is :"+ rate);
		return 0;
	}
	
	static double interest(int rate, int years) {
		double p=1000;
		double i= p*years*rate/100;
		System.out.println("The interest is:" + i);
		return 0;
	}
	
	public static void main(String[] args) {
		interest();
		interest(7);
		interest(10, 5);
	}

}
