package Assignment4.Module9;

import java.util.ArrayList;
import java.util.List;

//LEETCODE 22- GENERATE PARENTHESES
public class GenerateParenthesis {
    public static List<String> generate(int n){
        List<String> result=new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    public static void backtrack(List<String> result, String current, int open, int close, int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(open<n){
            backtrack(result, current+"(", open+1, close, n);
        }
        if(close<open){
            backtrack(result, current+")", open, close+1, n);
        }

    }
    public static void main(String[] args) {
        int n=3;
        List<String> ans=generate(n);
        System.out.println(ans);
    }
}
