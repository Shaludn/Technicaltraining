package week4.DataStructures.linear.Stack;

import java.util.Stack;
public class PostFixEvaluation {
    static int evaluate(String exp){
        Stack<Integer> s=new Stack<>();
        for(char c: exp.toCharArray()){
            if(Character.isDigit(c)){
                s.push(c-'0');//sTORE THE INTEGER VERSION...
            }
            else{
                int b=s.pop();
                int a=s.pop();

                switch (c){
                    case '+'-> s.push(a+b);
                    case '-'-> s.push(a-b);
                    case '*'-> s.push(a*b);
                    case '/' -> s.push(a/b);
                }
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        String exp="23*54*+9-";
        System.out.println(evaluate(exp));
    }
}
