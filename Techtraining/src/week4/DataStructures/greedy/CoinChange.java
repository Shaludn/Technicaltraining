package week4.DataStructures.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    static void findmincoins(List<Integer> coins, int V){
        List<Integer> res=new ArrayList<>();
        //if th array is not sorted, sort it first
        for(int i=coins.size()-1;i>=0;i--){
            while(V>= coins.get(i)){
                V-= coins.get(i);
                res.add(coins.get(i));
            }
        }
        System.out.println("Coins Started: ");
        for(int coin : res){
            System.out.println(coin+ " ");
        }
        System.out.println();
        System.out.println("Minimum coins selected "+ res.size());
    }
    public static void main(String[] args) {
        List<Integer> coins= Arrays.asList(1,2,5,10,20,50,100,200,500);
        int V1=91;
        findmincoins(coins, V1);
        int V2=31;
        findmincoins(coins, V2);
        int V3=55;
        findmincoins(coins, V3);
    }
}
