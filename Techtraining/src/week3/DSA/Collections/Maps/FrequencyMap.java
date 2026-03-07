package week3.DSA.Collections.Maps;
import java.util.*;
public class FrequencyMap {
    public static void main(String[] args) {
        int[] a={1,2,2,3,1,4};
        HashMap<Integer, Integer> m=new HashMap<>();
        for (int num: a){
            //(Initially, {1=0, 2=0, 3=0, 4=0})
            //After num is inserted, {1=1+1, 2=1+1, 3=1, 4=1
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        System.out.println(m);
        System.out.println(m.get(4));
    }
}
