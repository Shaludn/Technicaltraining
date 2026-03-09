package Assignment3.Module7;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
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
