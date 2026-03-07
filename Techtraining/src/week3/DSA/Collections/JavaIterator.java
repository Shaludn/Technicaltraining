package week3.DSA.Collections;
import java.util.*;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(11);
        list.add(32);
        list.add(21);
        list.add(3);
        System.out.println(list);
        Iterator<Integer> it=list.iterator();
        //Remove the elements which are greater than 10
        while (it.hasNext()){
            Integer i= it.next();
            if(i>10){
                it.remove();

            }
        }
        System.out.println(list);
    }
}
