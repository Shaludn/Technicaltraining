package week4.DataStructures.linear.Stack;

import java.util.Stack;
public class ValidParenthesis {

    static boolean isValid(String s){
        //if(s.length() %2!=0) return false;
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                //Push opening breaces onto the stack
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
        return st.empty(); //The string is valid parenthesis if all characters are removed
        //It is invalid if there are some mismatched characters.
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
