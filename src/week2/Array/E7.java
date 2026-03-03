package week2.Array;
//Array of Object(Student Objects)
class Student{
    String name;
}

class Intern{
    String name;
    int ID;

    Intern(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
}
public class E7 {

    public static void main(String[] args) {
        Student[] s=new Student[5];
        s[0]=new Student();
        s[0].name=" Shalu";
        System.out.println(s[0].name);
        Intern[] i =new Intern[]{
                new Intern("Shalu", 101),
                new Intern("Zalu", 102)

        };
        //The data type is class itself
        for(Intern m: i){
            System.out.println(m.ID + m.name);

        }

    }
}
