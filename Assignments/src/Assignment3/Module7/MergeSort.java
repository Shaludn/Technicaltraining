package Assignment3.Module7;

import java.util.Arrays;

public class MergeSort{
    public static void merge(int[] a, int s, int mid, int e){
        int n1=mid-s+1;
        int n2=e-mid;
        int[] L= new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1;i++){
            L[i]=a[s+i];
        }
        for(int j=0; j<n2;j++){
            R[j]=a[mid+1+j];
        }
        int i=0, j=0;
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
            int mid=s+ (e-s)/2;
            mergeSort(a, s, mid);
            mergeSort(a, mid+1, e);
            merge(a, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int[] a={32,23,5,4,52,19};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}

