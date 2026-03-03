package Assignment1;
import java.util.*;

public class multiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		int res=1;
		for(int i=1;i<=10;i++) {
			 res=n*i;
			 System.out.println(res+ " ");
		}
		
		s.close();

	}

}
