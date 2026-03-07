package week3.DSA.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(11);
        list.add(32);
        list.add(21);
        list.add(3);
        System.out.println(list);
        list.removeIf(n -> n%2==0);
        System.out.println(list);
    }
}
