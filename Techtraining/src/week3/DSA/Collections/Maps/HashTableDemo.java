package week3.DSA.Collections.Maps;
import java.util.*;
public class HashTableDemo {
    //No null values and keys is allowed in HashTable.
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(118, "Sudha");
        h.put(102, "VEer");
        h.put(112, "lena");
        h.put(100, "dino");
        for (Map.Entry<Integer, String> e : h.entrySet()) {
            System.out.println(e.getKey() + " , " + e.getValue());
        }

        System.out.println();
        h.remove(102);
        System.out.println(h);

        System.out.println();

        Hashtable<String, String> h1 = new Hashtable<>();
        h1.put("Engineer", "Sudha");
        h1.put("Doctor", "VEer");
        h1.put("Architect", "lena");
        h1.put("Teacher", "dino");
        for (Map.Entry<String, String> e1 : h1.entrySet()) {
            System.out.println(e1.getKey() + " , " + e1.getValue());
            //for string it either does the hashing by ASCII values or by hashcode.

        }
    }
}
