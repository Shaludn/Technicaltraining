package Assignment3.Module6;

public class KadanesMaxSubArray {

    static int kadane(int[] arr){
        int cMax=arr[0];//we'll consider 1st element of the array as current maximum value.
        int gMax=arr[0];//global max value;
        for(int i=1;i<arr.length;i++){
            cMax=Math.max(arr[i], cMax+arr[i]);
            gMax=Math.max(cMax, gMax);
        }
        return gMax;

    }

    static int kadane1(int[] arr1){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
            maxSum=sum>maxSum?sum:maxSum;
            sum=sum<=0?0:sum;
        }
        return maxSum;
    }
    public static void main(String[] args){
        int arr[]= {1,-2,3,-9,-6,4,5,6};
        System.out.println("Kadane : " + kadane(arr));
        System.out.println("Another method : " + kadane1(arr));
    }
}
