package week2.Nestedclasses;
//StaticInnerClass
public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        //classname.staticclassname.staticclassmethod...
        boolean result=University.Admission.isEligible(45);
        System.out.println(result);
    }
}

/*POINTS TO REMEMBER
No University object needed- No heap memoery needed.
Logical grouping of data- imporoves readability
Similar to creating utility-helper classes...
 */
