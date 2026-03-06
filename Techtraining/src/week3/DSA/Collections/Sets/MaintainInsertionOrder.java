package week3.DSA.Collections.Sets;
import java.util.*;
public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(3);
        s.add(6);
        s.add(8);
        System.out.println(s);
        //in order to maintain insertion order, use LinkedHashSet....
    }
}
