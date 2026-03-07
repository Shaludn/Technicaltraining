package week3.DSA.BackTracking;

import java.util.ArrayList;
import java.util.List;

//Subset questions.
public class Solution {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
        //Base case
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));// Add aa copy
            return;
        }
        //Exclude case:
        solve(nums, output, index+1, ans);
        //Include case:
        output.add(nums[index]);//Stores that value and move to next.
        solve(nums, output, index+1, ans);
        //Backtrack and remove the last answer from the output to next
        output.remove(output.size()-1);

    }

    public List<List<Integer>> subsets(int[] num){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        int[] nums={1,2,3};
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={1,2,3};
        List<List<Integer>> result=s.subsets(nums);
        for(List<Integer> subset: result){
            System.out.println(subset);
        }
    }
}

