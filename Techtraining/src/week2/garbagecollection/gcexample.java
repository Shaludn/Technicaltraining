package week2.garbagecollection;

public class gcexample {
	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Python");
		s1=s2;
		System.gc();
		System.out.println(s1);
	}

}
