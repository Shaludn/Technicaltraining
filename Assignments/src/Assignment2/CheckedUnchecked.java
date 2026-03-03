package Assignment2;
import java.io.*;

public class CheckedUnchecked {

        public static void main(String[] args) {
            try {
                FileReader fr = new FileReader("test.txt");
            } catch (IOException e) {
                System.out.println("Checked Exception caught: " + e);
            }

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Unchecked Exception caught: " + e);
            }
        }
    }

