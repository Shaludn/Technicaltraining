package Assignment1;
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String n=s.nextLine();
	String temp="";
	for(int i=n.length()-1; i>=0;i--) {
		 temp+=n.charAt(i);
	}
	System.out.println(temp);
	if(n.equals(temp)) {
		System.out.println("The string is palindrome");
	}
	else {
		System.out.println("The string is not palindrome");
	}

	s.close();
}
}