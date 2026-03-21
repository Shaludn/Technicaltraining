package Assignment4.Module11;

import java.util.Stack;

//LEETCODE 150- Evaluate Reverse Polish Notation
public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens){
        int a,b;
        Stack<Integer> st=new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(s.equals("/")){
                b=st.pop();
                a=st.pop();
                st.push(a/b);
            } else if (s.equals("*")) {
                st.push(st.pop()*st.pop());

            } else if (s.equals("-")) {
                b=st.pop();
                a=st.pop();
                st.push(a-b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
       String[] tokens={"2", "3", "+", "4", "*"};
       int result=evalRPN(tokens);
        System.out.println("Result: "+ result);
    }
}
