package week3.DSA.Collections.Sets;
import java.util.*;
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>(Collections.reverseOrder()); //Treeset always prints ascending order....
        s.add(130);
        s.add(342);
        s.add(432);
        s.add(32);
        System.out.println(s);

    }

}
