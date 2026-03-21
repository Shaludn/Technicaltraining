package Assignment4.Module8;

import java.util.Arrays;
import java.util.Scanner;
//LEETCODE-242 VALID ANAGRAM
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        String s1 = sc.next();
        sc.nextLine();
        System.out.println("Enter the second string : ");
        String s2 = sc.next();
        sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        if (Arrays.equals(c1, c2)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Invalid Anagram!!");
        }
        sc.close();
    }
}