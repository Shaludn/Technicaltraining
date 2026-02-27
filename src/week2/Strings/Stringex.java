package week2.Strings;
//String handling
public class Stringex {
	public static void main(String[] args) {
		char[] letters= {'S', 'U', 'M', 'I'};
		//String name=letters.toString() , only used in Wrapper classes
		String name=new String(letters);
		System.out.println(name);
		String jumb="Harsha1Is1From1ISE1B1section";
		String[] words=jumb.split("1");
		System.out.println(words[5]);
		for(Object o: words) {
			System.out.print(o + " ");
		}
		System.out.println();
		String data="        SCE    ISE   ";
		System.out.println(data.trim());//removes leading and trailing spaces
	}

}
