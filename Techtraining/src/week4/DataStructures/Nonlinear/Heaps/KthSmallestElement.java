package week4.DataStructures.Nonlinear.Heaps;
import java.util.*;
public class KthSmallestElement {
    static void kthsmall(int[] arr, int k){
        PriorityQueue<Integer> maxHEAP=new PriorityQueue<>(Collections.reverseOrder());
        //1.Insert he elements into the heap
        //2.Pop element exceeding the k size
        for(int num:arr){
            maxHEAP.add(num);
            if(maxHEAP.size()>k){
                maxHEAP.poll(); //Remove smallest if size>k
            }
        }
        //print kth largest
        System.out.println("the kth largest is:" + maxHEAP.peek());
        //print all the kth largest
        while (!maxHEAP.isEmpty()){
            System.out.println(maxHEAP.poll()+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={4,9,2,1,3,0};
        int k=3;
        kthsmall(arr, k);
    }
}
