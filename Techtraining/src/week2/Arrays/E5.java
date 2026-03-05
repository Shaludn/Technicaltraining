package Arrays;

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int[] arr2=new int[arr.length];
        System.out.println(Arrays.toString(arr2));
        //copy using for loop.
        for (int i=0; i< arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.print(Arrays.toString(arr2));
        //copy method
        int[] arr3=new int[arr.length];
        System.arraycopy(arr2,0,arr3,0,arr.length);
        System.out.println(Arrays.toString(arr3));
        //clone method
        int[] arr4= arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
