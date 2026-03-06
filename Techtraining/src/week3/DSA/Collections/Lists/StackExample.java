package week3.DSA.Collections.Lists;
import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;
public class StackExample {
    public
    static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());//display top element
        System.out.println("Size : "+ s.size());
        s.pop();// remove top element
        System.out.println("Size : "+ s.size());
        System.out.println(s);
        System.out.println(s.empty());
    }
}
