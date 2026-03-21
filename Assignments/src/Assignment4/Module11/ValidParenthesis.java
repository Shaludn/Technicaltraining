package Assignment4.Module11;

import java.util.Stack;

//LEETCODE-20, ValidParenthesis
public class ValidParenthesis {

    static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char top=st.pop();
                if(c==']' && top!='[')return false;
                if(c=='}' && top!='{') return false;
                if(c==')' && top!='(')return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s1= "{[()]}";
        String s2="{[}(]";
        String s3="[({[";
        System.out.println(isValid(s1)? "Valid" : "Not Valid");
        System.out.println(isValid(s2)? "Valid" : "Not Valid");
        System.out.println(isValid(s3)? "Valid": "Not Valid");
    }
}
