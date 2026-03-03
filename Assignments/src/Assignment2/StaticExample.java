package Assignment2;

public class StaticExample {
    static int m=10;

    static int add(){
        m+=1;
        System.out.println(m);
        return m;
    }

    public static void main(String[] args) {
        add();//Static variables and methods belongs to class, not to objects.
    }
}
