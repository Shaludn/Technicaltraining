package week3.DSA.BitManipulation;

public class SetKthBit {
    public static void main(String[] args) {
        int n=10;
        int k=0;
        int res=n | (1<<k);
        System.out.println(res);
    }
}
