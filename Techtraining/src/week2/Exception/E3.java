package week2.Exception;

public class E3 {
	static void checkAge(int n) {
		if(n>=18) {
			System.out.println("Eligible- Access Granted!!");
		}
		else {
			throw new RuntimeException("Not Eligible- Access Denied!!");// for frontend!!!, to show this to the user...
		}
	}
	
	public static void main(String[] args) {
		checkAge(15);
	}

}
