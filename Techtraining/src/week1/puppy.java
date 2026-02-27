package week1;

class Animal{
    void display(){
        System.out.println("Animals cannot talk");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks, bow bow!!");
    }
}

public class puppy extends Dog{
    void feature(){
        System.out.println("The puppy is tiny and cute");
    }
}