package week3.DSA.BitManipulation;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n=12; //1100 : 1(2^3) 1(2^2) 0(2^1) 0(2^0)-> RSB= 2^2-=4
        int res=n& -n;
        System.out.println(res);
    }
}
