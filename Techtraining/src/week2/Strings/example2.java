package week2.Strings;

public class example2 {
	//String is immutaable
	//we can only create copies-original string doesnt change
	//concat method creates a new object, so result is ignored..
	public static void main(String[] args) {
		String s="java";
		s.concat("Programming");//wont change the string...
		System.out.println(s);
		
	}
}
