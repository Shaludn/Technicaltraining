package week1;

//Method Overloading.
public class Calculator{
    static void calci(int a, int b){
        System.out.println(a+b);
    }
    static void calci(double a, double b){
        System.out.println(a*b);
    }
    static int calci(int a, int b, int c){
        return (a+b)/c;
    }

    public static void main(String[] args){
        calci(4,5);
        calci(3.5, 6.8);
        System.out.println(calci(7,8,9));
    }
}