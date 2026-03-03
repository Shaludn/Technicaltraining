package week2.Nestedclasses;

import java.time.LocalDate;

//Local InnerClass
public class Exam {
    void evaluate(int marks){
        //class under a method, is known as local innerclass
        class GradeCalculator{
            String calculate(){if(marks>=75) return "DISTNCTION";
                else if(marks>=60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }

    void displayExamDate(){
        LocalDate d= LocalDate.now().plusDays(4);
        System.out.println("The exam date is :" + d);
    }
    public static void main(String[] args) {
        Exam e=new Exam();
        e.evaluate(45);
        e.evaluate(64);
        e.evaluate(78);
        e.displayExamDate();
    }

}
/*
POINTS TO REMEMBER
Grade logic is scoped to the "evaluate" method
it avoids pollutiong the class with helper methods.
It helps in designing the codebase in a cleaner way.
 */