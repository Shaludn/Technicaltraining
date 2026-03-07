package week3.DSA.Collections.LambdaExpressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Product{
    String name;
    int price, qunatity;

    public Product(String name, int price, int qunatity) {
        this.name = name;
        this.price=price;
        this.qunatity=qunatity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> p = new ArrayList<>();
        p.add(new Product("Mobile", 30000, 5));
        p.add(new Product("PS5", 70000, 10));
        p.add(new Product("Laptop", 60000, 2));
        for (Product m : p) {
            System.out.println(m.name + " , " + m.price + " ," + m.qunatity);
        }
        System.out.println();

        Collections.sort(p, (p1, p2) -> p1.qunatity - p2.qunatity);
        for (Product m : p) {
            System.out.println(m.name + " , " + m.price + " ," + m.qunatity);
        }
    }
}
