package week3.DSA.Sorting;

import java.util.Arrays;
//TIME COMPLEXITY =O(n+max)
public class CountSort {
    public static void countSort(int[] arr){
        //Step 1:Find the max.
        int k=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }
        //Step 2: Create a count array 0-max
        int[] count=new int[k+1];
        //Step 3 : Calaculate the frequency of each element in the array.
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Calculate the cumulative frequency
        //Skip index  0 and start from 1 till max(k)
        for(int i=1;i<=k;i++){
            //curr=curr+prev
            count[i]+=count[i-1];
        }
        //Step 5:Create the output array
        int[] output=new int[arr.length];
        //Step 6: Start from the end of the input array(right->left)
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }
        /// Copy the output back to array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,4,1,6,4,3};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
