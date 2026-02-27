package Assignment1;
import java.util.*;

public class largestnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=s.nextInt();
		
		System.out.println("Enter the second number:");
		int b=s.nextInt();
		
		System.out.println("Enter the third number: ");
		int c=s.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is the largest number:"+ a);
		}
		else if(b>=c && b>=a) {
			System.out.println(" b is the largest number :"+ b);
			
		}
		else {
			System.out.println(" c is the largest number :"+ c);
		}
		
		
		
		s.close();
	}


}
