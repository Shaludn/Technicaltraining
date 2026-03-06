package week3.DSA.Collections.Lists;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("Comb");
        cart.add("PS5");
        cart.add(" Mouse");
        cart.remove("Comb");
        cart.set(0, "Joystick");
        System.out.println(cart);
        System.out.println("Total size: "+ cart.size());
    }
}
