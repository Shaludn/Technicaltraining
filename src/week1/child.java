package week1;

public class child extends parent {
    int x=20;
    void show(){
        super.print();// super keyword calling method
        System.out.println(x);
        System.out.println(super.x);// super method calling variable
    }

    public static void main(String[] args){
        child c=new child();
        c.show();
    }
}