package Assignment4.Module9;
//LeetCODE -46 Permutations
import java.util.*;
public class Permutation {
    public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(result, new ArrayList<>(),nums, used );
        return  result;
    }
    public static  void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;

            used[i]=true;
            current.add(nums[i]);
            backtrack(result, current, nums, used);
            current.remove((current.size()-1));
            used[i]=false;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> result=permutation(nums);
        System.out.println(result);
    }
}
