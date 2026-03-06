package week3.DSA.Collections.Base;
import java.util.*;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<Integer> liveOrders= new ArrayList<>();
        //new orders are added
        liveOrders.add(101);
        liveOrders.add(102);
        System.out.println(liveOrders.contains(103));

        liveOrders.clear();
        System.out.println(liveOrders);

        System.out.println(liveOrders.remove(102));


    }
}
