package week2.Array;

public class E1 {
    public static void main(String[] args) {

    //Method 1
    int[] arr1; //Declaration
    arr1= new int[5]; //Memory allocation

    //Declaration+ Memory Allocation
    //If we dont porvide value
    //JVM uses "Fallback mechanism"
    //It uses the default value

    //Method 2
    int[] arr2=new int[5];
    System.out.println(arr1[4]); // output is 0
    System.out.println(arr2[5]);//Output is 0

   //Method 3
   int[] arr3={ 1,2,3,4,5};

   //Method 4
   int[] arr4=new int[] { 1,3,4,5,5};


}

}
