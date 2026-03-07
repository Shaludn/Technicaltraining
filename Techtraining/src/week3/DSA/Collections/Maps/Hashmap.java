package week3.DSA.Collections.Maps;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> m=new HashMap<>();
        m.put("admin", "admin@123");
        m.put("leena", " 123");
        m.put("admin", "admin@456");
        System.out.println(m.get("admin"));
    }
}
