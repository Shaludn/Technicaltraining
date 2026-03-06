package week3.DSA.Collections.Sets;
import java.util.*;
public class Wildcards {
    public  static void printList(List<?> list){
        for(Object o: list){
            System.out.print(o+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("Java");
        s.add("Python");
        s.add("C++");
        printList(s);

        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        printList(l);
    }
}
