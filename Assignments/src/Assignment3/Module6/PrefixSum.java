package Assignment3.Module6;

public class PrefixSum {

    static int prefix(int[] arr){
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i< arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int x:prefix){
            System.out.print(x+ " ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,6,7,2,3};
        System.out.println(prefix(arr));
    }
}
