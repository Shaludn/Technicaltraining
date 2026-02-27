package week2.Strings;
import java.lang.*;
public class Stringmethods {
	public void stringInsert() {
		StringBuffer s=new StringBuffer("Ja");
		System.out.println("Old string: "+ s);
		s.insert(1, "Av");
		System.out.println("new string:" + s);
		
	}
	
	public void stringAppend() {
		StringBuffer s=new StringBuffer("SCE");
		System.out.println("Old string: "+ s);
		s.append("ISE");
		
		System.out.println("new string:" + s);
		
		
	}
	
	public void stringReverse() {
		StringBuffer s=new StringBuffer("MAM");
		System.out.println("Old string: "+ s);
		s.reverse();
		
		System.out.println("new string:" + s);
		
		
	}
	
	public static void main(String[] args) {
		new Stringmethods().stringAppend();
		new Stringmethods().stringInsert();
		new Stringmethods().stringReverse();
		
	}

}
