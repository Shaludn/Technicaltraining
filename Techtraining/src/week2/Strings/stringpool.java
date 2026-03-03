package week2.Strings;

public class stringpool {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		System.out.println(s1==s2);//checks values, both are variables
		String s3=new String("Java");
		System.out.println(s1==s3);//checks address, one is variable and one is object
		System.out.println(s1.equals(s3));//checks for values
		System.out.println(s1.compareTo(s2));
		String s= "SCE ISE  B  SECTION      ";
		System.out.println(s.strip());
		
	}

}
/* s1 and s2 share same object in the pool
* new string() creates new heap object
== compares references
.equals(), compares values*/