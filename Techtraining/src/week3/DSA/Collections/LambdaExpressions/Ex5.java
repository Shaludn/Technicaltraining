package week3.DSA.Collections.LambdaExpressions;
import java.util.*;
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(6);
        System.out.println("Initial list : "+ a);
        Collections.sort(a, (x,y)-> x-y);//Ascending
        System.out.println("Sorted list: " + a);
        Collections.sort(a, (x,y) -> y-x);//Descending
        System.out.println("Sorted list : "+ a);

    }
}
