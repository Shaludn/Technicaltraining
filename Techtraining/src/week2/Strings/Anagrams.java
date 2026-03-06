package week2.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    //SILENT-LISTEN, NIGHT-THING, ARTICAL-RECITAL, DIRTY ROOM-DORMITORY
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char [] a= s1.toCharArray();//s, i , l, e, n,t
        char[] b =s2.toCharArray();//l, i, s,t,e,n
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (Arrays.equals(a, b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }


    }
}
