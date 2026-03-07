package week3.DSA.BitManipulation;

public class EvenOddBit {
    public static void main(String[] args) {
        int n=7;
        if((n&1)==0){
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " is Odd");
        }
    }
}
