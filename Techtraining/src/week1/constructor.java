package week1;

class constructor{
    int age;
    String name;

    constructor(String n, int a){
        name=n;/* this keyword is used when the instance variable and local variable names are same,
                compiler gets confused. to make a difference this keyword is used.*/
        age=a;
    }
    void display(){
        System.out.println(name+ " " + age);
    }

    public static void main(String[] args){
        constructor ob=new constructor("Shalu", 21);
        ob.name="Shalu";
        System.out.println(ob.name);
        ob.display();
    }
}