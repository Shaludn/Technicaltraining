package week3.DSA.Specialalgos;

public class KadanesAlgorithm {

    static int kadane(int[] arr){
        int cMax=arr[0];//currentMax
        int gMax=arr[0];//Global Max...
        for(int i=1; i<arr.length;i++){
            cMax=Math.max(arr[i], cMax+arr[i]);
            gMax=Math.max(cMax, gMax);//you can change it to minimum aswell...
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr={5,-8,1,2,-1,4};
        System.out.println(kadane(arr));
        int[] ar1={-2,3,6,8,-4,5,6,7};
        System.out.println(kadane(ar1));

    }
}
