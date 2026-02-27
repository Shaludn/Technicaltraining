package Assignment1;

class Student{
    private String name;
    private int age;

    Student(String n, int a){
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