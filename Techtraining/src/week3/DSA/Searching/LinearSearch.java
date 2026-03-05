package week3.DSA.Searching;

public class LinearSearch {
    static int linearseaech(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;//return index, if target found.
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={4,8,5,6,9,2};
        int target=6;
        System.out.println(linearseaech(arr,target));
    }
}
