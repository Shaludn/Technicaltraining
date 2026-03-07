package week3.DSA.Collections.LambdaExpressions;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> m = new ArrayList<>();
        m.add(10);
        m.add(3);
        m.add(2);
        m.forEach(System.out::println); //STREAM API Java 8
        m.forEach(n -> System.out.println(n));//Lambda

    }
}
