package Assignment3.Module6;
import java.util.*;
public class TwoSum {
    public static int[] twosumm(int[] arr, int target){
        HashMap<Integer, Integer> s=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int diff= target-arr[i]; //ex:arr=1,3,4,7,9, 7-3=4.

            if(s.containsKey(diff)){
                return new int[]{s.get(diff), i};
            }
            s.put(arr[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,7,9};
        int target=7;
        int [] result= twosumm(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
