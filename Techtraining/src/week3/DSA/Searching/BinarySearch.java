package week3.DSA.Searching;

public class BinarySearch {
    static int binarysearch(int[] arr, int key) {
        int s=0;
        int e= arr.length-1;
        while (s <= e) {
            int mid=s+ (e-s)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                s=mid+1;//Go to right side
            }
            else {
                e = mid - 1;//go to left side
            }
        }
        return -1;
        }

        public static void main (String[]args){
            int[] arr = {2, 6, 7, 9, 11, 12};
            int key=9;
            System.out.println(binarysearch(arr, key));


        }
    }
