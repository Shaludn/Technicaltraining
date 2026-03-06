package week3.DSA.Sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergesort(int[] a, int[] b){
        int n1=a.length;
        int n2=b.length;
        int i=0, j=0, k=0;
        int[] c=new int[n1+n2];
        //Edge Case
        while(i<n1 && j<n2){
            if(a[i]<a[j]){
                c[k++]=a[i++];
                }
            else{
                c[k++]=b[j++];
            }
        }
        //CHECCK IF THERE ARE ANY REMAINIG ELEMENTS IN THE TWO ARRAYS
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a={1,3,5,7,9,11};
        int[] b={2,4,6};
        int[] c=mergesort(a, b);
        System.out.println(Arrays.toString(c));
    }
}
