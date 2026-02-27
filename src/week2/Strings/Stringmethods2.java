package week2.Strings;
import java.lang.*;
public class Stringmethods2 {
	public void stringInsert() {
		StringBuilder s=new StringBuilder("Ja");
		System.out.println("Old string: "+ s);
		s.insert(1, "Av");
		System.out.println("new string:" + s);
		
	}
	
	public void stringAppend() {
		StringBuilder s=new StringBuilder("SCE");
		System.out.println("Old string: "+ s);
		s.append("ISE");
		
		System.out.println("new string:" + s);
		
		
	}
	
	public void stringReverse() {
		StringBuilder s=new StringBuilder("MAM");
		System.out.println("Old string: "+ s);
		s.reverse();
		
		System.out.println("new string:" + s);
		
		
	}
	
	public static void main(String[] args) {
		new Stringmethods2().stringAppend();
		new Stringmethods2().stringInsert();
		new Stringmethods2().stringReverse();
		
	}

}
