package Assignment3.Module7;

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
        int result=binarysearch(arr, key);
        int result1=recursivebinarysearch(arr, key, 0, arr.length-1);
        System.out.println(result);
        System.out.println(result1);

    }

}
