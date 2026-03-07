package week3.DSA.BitManipulation;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " Power of 2");
        } else {
            System.out.println(n + " not power of 2");
        }
    }
}
