package Assignment4.Module8;
//LEETCODE-191 Number of 1 Bits
public class Check1Bits {
    static int checkBits(int n){
        int c=0;
        while(n!=0){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("No of 1 bits in "+ n + " is : "+ checkBits(n));
    }

}
