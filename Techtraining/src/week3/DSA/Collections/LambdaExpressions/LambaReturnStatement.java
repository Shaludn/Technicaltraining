package week3.DSA.Collections.LambdaExpressions;
interface Calculator{
    int operate(int a, int b);
}
public class LambaReturnStatement {
    public static void main(String[] args) {
        Calculator m=(a,b)-> {
            int result=a*b;
            return result;
        };
        System.out.println(m.operate(20,30));
    }
}
