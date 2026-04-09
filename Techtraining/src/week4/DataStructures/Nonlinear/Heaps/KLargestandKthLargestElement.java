package week4.DataStructures.Nonlinear.Heaps;

import java.awt.print.PrinterIOException;
import java.util.PriorityQueue;

public class KLargestandKthLargestElement {
    static void findkthlargest(int[] arr, int k){
        PriorityQueue<Integer> minHEAP=new PriorityQueue<>();
        //1.Insert he elements into the heap
        //2.Pop element exceeding the k size
        for(int num:arr){
            minHEAP.add(num);
            if(minHEAP.size()>k){
                minHEAP.poll(); //Remove smallest if size>k
            }
        }
        //print kth largest
        System.out.println("the kth largest is:" + minHEAP.peek());
        //print all the kth largest
        while (!minHEAP.isEmpty()){
            System.out.println(minHEAP.poll()+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={19,21,4,9,3,7};
        int k=3;
        findkthlargest(arr, k);
    }
}
