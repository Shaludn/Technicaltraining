package week4.DataStructures.DP.oneD;

public class FibonacciTabulation {
    //in the tabulation code,we create the dp array in the helper function.
    public static int fibb(int n){
        if(n<=1){
            return n;
        }
        //Step 1: createa dp array, of [n+1] 0-based indexing.
        //Step 2: Store the known values
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        //Take a for loop, from 2 till n
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("fibonacci : "+ fibb(n));
    }
}
