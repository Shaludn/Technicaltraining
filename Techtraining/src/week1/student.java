package week1;

//Encapsulation. we can modify the private variables and methods using get and set method
class student{
    private String name;
    private int age;

    student(String n, int a){
        name=n;
        age=a;
    }
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }
}