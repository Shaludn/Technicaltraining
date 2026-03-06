package week2.Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s="HELLO";
        String reverse= " ";
        for(int i=s.length()-1; i>=0; i--){
            reverse+= s.charAt(i);
        }
        System.out.println(reverse);
    }
}
