package week3.DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertion(int[] arr){
        int temp;
        for(int i=1;i<arr.length-1;i++){
            temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                //SHIFT operations...
                arr[j+1]=arr[j];
                j--; //Create empty space [] by shifting....

            }
            arr[j+1]=temp;//Fill the space [] with temp variable.

        }

    }
    public static void main(String[] args) {
        int[] arr={1,4,6,0,7,2,6};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));


    }
}
