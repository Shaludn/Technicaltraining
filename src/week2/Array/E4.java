package week2.Array;

public class E4 {
    //Passing array into method-Array is call by value.
    public static void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] createArray(){//returns an array of integers
        return new int[] {10,20,30};// new array created and returned.
    }
    public static void main(String[] args) {
        int[] arr={1,2,34,5,35};
        printArray(arr);
        int[] result=createArray();
        for(int num: result){
            System.out.print(num + " ");
        }
        System.out.println();

        //Anonymous array -> we dont have a reference or object
        //After the method call, we can never access it.
        printArray(new int[] {100,200,300});
    }
}
