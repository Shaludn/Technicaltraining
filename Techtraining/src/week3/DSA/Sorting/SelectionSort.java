package week3.DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {4,8,0,2,1,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
