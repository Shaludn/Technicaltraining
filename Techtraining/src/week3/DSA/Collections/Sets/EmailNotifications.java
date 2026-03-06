package week3.DSA.Collections.Sets;

import java.util.*;
public class EmailNotifications {
    public static void main(String[] args){
        Set<String> e= new HashSet<>();
        e.add("a@gmail.com");
        e.add("b@gmail.com");
        e.add("m@gmail.com");
        e.add("a@gmail.com");
        System.out.println(e);
        System.out.println(e.hashCode());

    }
}
