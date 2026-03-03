package week2.Array;

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        //Copy one array into another using for loop
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3=new int[arr2.length];
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);// to copy one array to another.
        System.out.println(Arrays.toString(arr3));

        //Clone method
        int[] arr4=arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
