package Arrays;


class Student {
    String name;
    int id;
}
class Intern{
    String name;
    int id;
    Intern(String name, int id){
        this.name=name;
        this.id=id;
    }
}

//Array of {Student Objects}
public class E7 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
         students[0]=new Student();
         students[0].name="Rahul";
         students[0].id=45;
        System.out.println(students[0].name+" " + students[0].id);
        Intern[] interns= new Intern[]{
                new Intern("Shalu",89),
                new Intern("Piyush" ,65)
        };
//        The data type is a class itself
        for (Intern i: interns){
            System.out.println(i.name +" " + i.id);
        }
    }
}
