package week1;

class Parent{
    Parent(){
        System.out.println("This is parent class");
    }
}

public  class  child1 extends Parent{
     child1(){
        super();//super method
        System.out.println("This is child class");
     }

     public static void main(String[] args){
        child1 c=new child1();//super method calling constructor.
     }
}