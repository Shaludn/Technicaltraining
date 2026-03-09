package Assignment3.Module6;
import java.util.*;
public class DifferenceSum {
    public static void main(String[] args) {
        int n=7;
        int diff[] = new int[n];
        int leftvalue=2, rightvalue=4, value=8;
        diff[leftvalue]+=value;
        if(rightvalue+1<n){
            diff[rightvalue+1]-=value;
    }
        int result[]= new int[n];
        result[0]=diff[0];
        for(int i=1; i< diff.length;i++){
            result[i]=result[i-1]+diff[i];
        }
        for(int x: result){
            System.out.print(x + " ");
        }
    }
}
