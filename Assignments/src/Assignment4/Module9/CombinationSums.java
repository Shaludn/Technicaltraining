package Assignment4.Module9;

import java.util.ArrayList;
import java.util.List;
//LEETCODE 39 COMBINATION SUM
public class CombinationSums {
    public static List<List<Integer>> combination(int[] candidates, int target){
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates,target,0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] candidates, int target, int start, List<Integer> current,
                                 List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=0; i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, current, result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates={2,3};
        int target=7;
        List<List<Integer>> ans=combination(candidates, target);
        System.out.println(ans);

    }

}
