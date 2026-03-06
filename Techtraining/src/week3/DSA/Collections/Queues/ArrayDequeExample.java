package week3.DSA.Collections.Queues;
import java.util.*;
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> a=new ArrayDeque<>();
        a.addLast("User types A");
        a.addLast("User types B");
        a.addLast("User types C");
        a.addFirst("user types m");
        System.out.println("undo :"+ a.removeLast());

    }
}
