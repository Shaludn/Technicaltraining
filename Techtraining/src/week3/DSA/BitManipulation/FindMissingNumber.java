package week3.DSA.BitManipulation;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,5};
        int n=a.length+1;
        int xor1=0;
        int xor2=0;

        for(int i =0; i<=n;i++){
            xor1^=i;
        }
        for(int num: a){
            xor2^=num;
        }
        int missing=xor1^xor2;
        System.out.println(missing);
    }
}
