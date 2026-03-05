package week2.Arrays;

public class DifferenceSum {
    public static void main(String[] args) {
        int n=5;
        int[] diff = new int[n]; //0,0,0,0,0
        int l=1, r=3, val=10;
        int i;
        diff[l]+=val;
        if(r+1<n){
            diff[r+1]-=val;
        }
        int [] result = new int[n];//0, 0, 0, 0,0
        result[0]=diff[0];
        for(i=1;i<n;i++){
            result[i]= result[i-1]+ diff[i];
        }
        for(int x: result){
            System.out.print(x+ " ");
        }


    }
}
