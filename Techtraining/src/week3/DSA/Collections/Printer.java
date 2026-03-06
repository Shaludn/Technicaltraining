package week3.DSA.Collections;
//Generics
public class Printer<T> {
    T data;

    Printer(T data) {
        this.data = data;
    }

    void printValue() {
        System.out.println("data : " + data);
    }

    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(1);
        Printer<String> p1 = new Printer<>("Sam");
        Printer<Boolean> p2 = new Printer<>(true);
        Printer<Double> p3=new Printer<>(1.34);
        p.printValue();
        p1.printValue();
        p2.printValue();
        p3.printValue();
    }
}
