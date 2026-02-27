package week1;

import java.util.Scanner;

public class neon {

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square = square / 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }

        sc.close();
    }
}