package week2.Array;
//Varargs
public class E6 {
    public static void display(int... arr){ //int... args, is varargs!! it means array only.
        for(int num: arr){
            System.out.println(num);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        display(arr);
    }
}
