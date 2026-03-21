package Assignment4.Module8;
//LEETCODE-387 FIRST UNIQUE CHARACRTER IN STRING
public class FirstUniqueCharactersInString {

    public static int unique(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println("First Unique character in string "+ "{" +s + "} is: " + unique(s));
    }
}
