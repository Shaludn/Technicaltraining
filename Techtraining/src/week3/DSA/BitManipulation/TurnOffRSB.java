package week3.DSA.BitManipulation;

import java.util.Scanner;

public class TurnOffRSB {
    public static void main(String[] args) {
        int n=12;
        int r = n & (n - 1);
        System.out.println(r);
    }
}
