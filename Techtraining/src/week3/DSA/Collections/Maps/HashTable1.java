package week3.DSA.Collections.Maps;
import java.util.*;
public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> h=new Hashtable<>();
        h.put(118, "Sudha");
        h.put(102, "VEer");
        h.put(112, "lena");
        h.put(100, "dino");
        System.out.println(h.getOrDefault(102, "Not found"));
        h.putIfAbsent(104, "Gaurav");//this will be added.
        System.out.println(h);

    }
}
