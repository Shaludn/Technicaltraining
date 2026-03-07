package week3.DSA.Collections.Maps;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        //The values can be duplicate but keys have to be unique.
        Map<String, Integer> m=new HashMap<>();
        m.put("Sudha ", 101);
        m.put("Mona", 02);
        m.put("Abhay", 10);
        m.put("Bhavya", 21);
        for(Map.Entry<String, Integer> h : m.entrySet()){
            System.out.println(h.getKey() + " , " + h.getValue());
        }
        System.out.println();

        Map<String, Integer> m1=new LinkedHashMap<>();
        m1.put("Sudha ", 101);
        m1.put("Mona", 02);
        m1.put("Abhay", 10);
        m1.put("Bhavya", 21);
        for(Map.Entry<String, Integer> h1 : m1.entrySet()){
            System.out.println(h1.getKey() + " , " + h1.getValue());
        }
    }
}
