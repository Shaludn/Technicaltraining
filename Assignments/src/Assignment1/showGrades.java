package Assignment1;
import java.util.*;
public class showGrades {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks=s.nextInt();
		int grade=marks/10;
		
		switch(grade) {
		case 10:
		case 9:
			System.out.println("The grade is A");
		break;
		
		case 8:
			System.out.println("The grade is B");
		break;
		
		case 7: 
			System.out.println("The grade is C");
			break;
		
		case 6:
			System.out.println("The grade is D");
			break;
		
		case 5: 
			System.out.println("The grade is F");
			break;
			
		default: System.out.println("Invalid marks");
		}
		s.close();
	}

}
