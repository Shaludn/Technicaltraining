package week1;

public class staticex2{
    static int c=0;
    int id;

    staticex2(){
        c++;
        id=c;
        System.out.println("Object: "+ id);
    }

    public static void main(String[] args){
        staticex2 c1=new staticex2();
        staticex2 c2=new staticex2();
        staticex2 c3=new staticex2();

        System.out.println("Total no. of times object created:"+ c1.staticex2());
    }
}