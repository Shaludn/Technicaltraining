package week3.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { //1to n-1 iterations => n[iterations].
            for (int j = 0; j < n - 1; j++) {//go till 2nd last
                //Optimized code-> rather than n-1 we can write n-i;
                //Because every iteration 1 comparison is reduced...
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1], adjacent elements whenever required
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 5};
        System.out.println("Array befor sort : " + Arrays.toString(arr));
        bubble(arr);
        System.out.println("Array after sort :" + Arrays.toString(arr));


    }
}


