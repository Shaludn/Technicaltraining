package week3.DSA.Collections.Maps;
import java.util.*;
public class Linkedhashmap {
    public static void main(String[] args) {
        Map<String, String> logs=new LinkedHashMap<>();
        logs.put("2", "Signup");
        logs.put("1", " Login");
        logs.put("4", "Browse Videos");
        logs.put("3", "Scroll Up or Scroll Down");
        logs.put("5", "Logout");
        System.out.println("API Logs: "+ logs);
    }
}
