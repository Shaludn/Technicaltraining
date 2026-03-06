package week3.DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partitionIndex(int[] a, int s, int e){
        int pivot=a[s];
        int count=0; //how many elemets are lesser than pivot
        for(int i=s+1;i<=e;i++){
            if(a[i]<pivot){
                count++;
            }
        }
        //Place the pivot at the courrent position or index.
        int pivotIndex=s+count;
        swap(a,pivotIndex, s);
        //Lets manange the left and right of the pivot.
        int i=s, j=e;
        while (i<pivotIndex && j>pivotIndex){
            while(a[i]<pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(a, i++ ,j--);
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int[] a, int s, int e){
        //Base Case
        if(s>=e){
            return;
        }
        //else find the pivot for the partition of the element
        int p=partitionIndex(a, s,e);
        //Now we use recursion to sort the LHS and RHS.
        //Left part
        quickSort(a, s, p-1);
        //Right part
        quickSort(a, p+1, e);
    }

    public static void main(String[] args) {
        int[] a={1,6,3,7,4,2};
        quickSort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));


    }
}
