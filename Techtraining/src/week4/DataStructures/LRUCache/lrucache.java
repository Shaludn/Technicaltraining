package week4.DataStructures.LRUCache;
import java.util.*;
import week3.DSA.Collections.Maps.Linkedhashmap;

public class lrucache<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public lrucache(int capacity){
        //the 'true' at the end is the magic ingredient
        //it tells the map to order items by access time,
        //not insertion time.
        super(capacity, 0.75f, true);
        this.capacity=capacity;

    }
    //this is the built in method in LinkedHashMap
    //We Override it to tell Java exactly when to start
    //kicking old items out.
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        //if the size gets bigger than our capacity, return true
        //(kick the oldest out)
        return size()>capacity;
    }
    public static void main(String[] args) {
        //Lets build our 3-pair shoe rak
        lrucache<String, String> shoerack=new lrucache<>(3);
        shoerack.put("Monday", "Sneakers");
        shoerack.put("Tuesday", "Boots");
        shoerack.put("Wednesday", "SANDALS");
        System.out.println("Rak Contents: "+ shoerack);
        //Now lets say we access the "Sneakers" again on thursday
        //This makes Sneakers the MOST recently used
        shoerack.get("Monday");
        System.out.println("Rak Contents: "+ shoerack);
        //We buy a new Loafers and try to put them on the rack
        shoerack.put("Thursday", "Loafers");
        //Let's see what got kicked out
        System.out.println("Rack after adding Loafers :"+ shoerack);
        //boots are kiced out because sneakers are accessed....
    }
}
