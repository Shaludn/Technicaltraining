package week1;

//Method Overirding
class book{
    void print(){
        System.out.println("books are fun to read");
    }
}

public class cm extends book{
    @Override
    void print(){
        System.out.println("classmates books are of good quality");
    }
    public static void main(String[] args){
    book c=new cm();
    c.print();
    }
}