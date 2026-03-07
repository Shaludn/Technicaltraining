package week3.DSA.Collections.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> a=new ArrayList<>();
        a.add(new Student(101, "Mohit"));
        a.add(new Student(109, "Hina "));
        a.add(new Student(100, "Ana"));
        for (Student s:a){
            System.out.println(s.id + ": " + s.name);
        }
        System.out.println();
        Collections.sort(a, (s1,s2) -> s1.id -s2.id);
        for (Student s: a){
            System.out.println(s.id + ": " + s.name);
        }
    }
}
