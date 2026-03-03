package week2.Strings;

public class mutablestrings {
	public static void main(String[] args) {
		String s="SCE";
		s+="ISE";//not recommended...
		StringBuffer b=new StringBuffer("Sce");//Mutable-thread safe
		b.append(" ISE");
		System.out.println(b);
		StringBuilder bi=new StringBuilder("SCE");//mutablee but not thread safe
		
		
	}

}
//all belongs to java.lang package..