package week3.DSA.Collections.LambdaExpressions;
//Lambda expression is used to create anonymous function
interface Add{
    int sum(int a, int b);
}
public class Ex2 {
    public static void main(String[] args) {
        Add add=(a,b)-> a+b;
        int result=add.sum(10, 20);
        System.out.println(result);
    }
}
