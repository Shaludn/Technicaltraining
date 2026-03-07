package week3.DSA.Collections.LambdaExpressions;
interface Square{
    int calculate(int a);
}
public class Ex3 {
    public static void main(String[] args) {
        Square s=a->a*a;
        System.out.println("Square : "+ s.calculate(9));
    }
}
