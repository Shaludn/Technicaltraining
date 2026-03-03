package Assignment2;

public class StringDiff {
    public static void main(String[] args) {
        String s="Heyy";
        s= s+ " Hello";
        System.out.println(s); //String is immutable,it creates a new memory to store s.

        StringBuffer s1=new StringBuffer("Good");
        System.out.println(s1.append("Morning")); //String buffer is mutable

        StringBuilder s2=new StringBuilder("Namaste");

        System.out.println(s2.append("London"));//String builder is mutable.

    }
}
