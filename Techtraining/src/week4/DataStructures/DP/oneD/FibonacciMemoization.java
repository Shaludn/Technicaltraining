package week4.DataStructures.DP.oneD;

import java.util.Arrays;

public class FibonacciMemoization {
    public static int fib(int n, int[] dp){
        //Base case
        if(n<=1) return n;
        //Step 2::
        //if you have the value, dot calculate just return.
        if(dp[n]!=-1){
            return dp[n];
        }
        //Step 3:
       return dp[n]=fib(n-1, dp)+fib(n-2, dp);

    }
    public static void main(String[] args) {
        int n=6;
        //Step 1: create 1D dp table oof size n+1 (0-based)
        int[] dp=new int[n+1]; //0-based indexing.
        //substep of 1 : Fill the array with default values -1.
        Arrays.fill(dp, -1);
        System.out.println("fibonnacci :" + fib(n, dp));
    }
}
