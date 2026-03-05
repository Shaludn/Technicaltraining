package Arrays;

public class E1 {
    public static void main(String[] args) {
        int[] arr1;      //Declaration
        arr1=new int[8];  //Memory allocation [32bytes]
        //Declaration +Memory allocation in single line
        //If we dont provide value
        //The JVM uses "Fallwback Mechanism"
        //It uses th edefault value of that data type
        //Method 2
        int[] arr2=new int[5];
        System.out.println(arr2[4]);   //output=0
        System.out.println(arr1[3]);   //output=0
        //Method 3
        int[] arr3={1,2,3,4,5};
        //Method 4
        int[] arr4 =new int[]{1,2,3,4,5};
    }

}
