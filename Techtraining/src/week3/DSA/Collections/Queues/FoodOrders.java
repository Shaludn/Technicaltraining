package week3.DSA.Collections.Queues;
import java.util.*;
public class FoodOrders {
    public static void main(String[] args) {
        //or adding - add() [Fail][Strict], offer() [Not Fail][Not Strict]
        Queue<String> q=new LinkedList<>();
        q.add("Order01");
        q.add("Order02 ");//Strict capacity based..
        q.offer("order103");//flexible
        System.out.println(q);
        //for removal : remove() -> Strict[Fail] poll() Not Strict[NotFail]
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());


    }
}
