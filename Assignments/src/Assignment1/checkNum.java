package Assignment1;

public class checkNum {
	int n;
	
	static void check(int n) {
		if(n==0) {
			System.out.println("The given number is zero");
		}
		else if(n>0) {
			System.out.println("The given number is positive");
		}
		else {
			System.out.println("The given number is negative");
		}
	}

	public static void main(String[] args) {
		check(9);
		check(-8);
		check(0);
		

	}

}
