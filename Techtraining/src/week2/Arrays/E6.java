package Arrays;
//Varargs
public class E6 {

    public static void display(int ...arr){       //Compulsary 3 dots only, or [] .
         for(int num: arr){
            System.out.print(num +" ");
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);
    }
}
