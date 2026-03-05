package week3.DSA.Searching;

public class RecursiveBinarySearch {
    static int recursivebinarysearch(int[] arr, int key, int s, int e){
        if(s>e) return -1;//Base Case
        int mid = s+ (e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key)
            return recursivebinarysearch(arr, key, mid+1, e);//start changes
        else
            return recursivebinarysearch(arr, key, s, mid-1);//end changes

    }
    public static void main(String[] args) {
        int[] arr={2,5,8,9,12,14};
        int key=9;
        int result=recursivebinarysearch(arr, key, 0, arr.length-1);
        System.out.println(result);

    }
}
