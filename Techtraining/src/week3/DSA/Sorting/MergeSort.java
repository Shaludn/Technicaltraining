package week3.DSA.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] a, int s, int mid, int e){
        //Sizes of the two sub array to be merged;
        int n1=mid-s+1;//for leftl length
        int n2=e-mid;
        int[] L= new int[n1];
        int[] R = new int[n2];
        //Copy the data to the temporary arrays.
        for(int i=0; i<n1;i++){
            L[i]=a[s+i];
        }
        for(int j=0; j<n2;j++){
            R[j]=a[mid+1+j];
        }
        //Initial indexes of first and second subaarays
        int i=0, j=0;
        //Initialize index of the merged subarray
        int k=s;
        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k++]=L[i++];
            }
            else{
                a[k++]=R[j++];
            }
        }
        while(i<n1){
            a[k++]=L[i++];
        }
        while(j<n2){
            a[k++]=R[j++];
        }
    }
    public static void mergeSort(int[] a, int s, int e){
        if(s<e){
            //Find the middle point
            int mid=s+ (e-s)/2;
            //Sort first and second halves
            mergeSort(a, s, mid);
            mergeSort(a, mid+1, e);
            //merge the sorted halves into one.
            merge(a, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int[] a={32,23,5,4,52,19};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
