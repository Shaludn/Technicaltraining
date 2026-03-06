package week3.DSA.Collections.Sets;
import java.util.*;
public class RemoveElements {
    public static void main(String[] args) {
        int[] arr= {1,2,3,3,4,3,5,3,6,8,7,7,9};
        System.out.println(Arrays.toString(arr));
        Set<Integer> s= new HashSet<>();
        for(int x: arr){
            s.add(x);
        }
        System.out.println(s);

        Set<Integer> nonduplicates=new HashSet<>();
        nonduplicates.addAll(Arrays.asList(1,2,3,3,4,2,4,6,8,9,0,0));
        System.out.println(nonduplicates);

    }
}
