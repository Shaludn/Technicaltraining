package Arrays;

public class E2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        //System.out.println(arr[1]);
        arr[1]=40;
       // System.out.println(arr[1]);
        //Access & Update elements in an array -> Time complexity O(1).
        //This is because of index based access or direct index mapping
        //[idx = pos - 1] or [pos = idx + 1]
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int x: arr){
            System.out.print(x+ " ");
        }
        System.out.println();
        for(Object o: arr){
            System.out.print(o +" ");
        }
        System.out.println();
        String name = "Java ";
        System.out.println(name.length());
    }
}
/*
* array.length is a property
* string.length() is a method
* Memory management-- imp question
* Array object is stored in heap memory
* Variable refernce is stored in stack
* Elements are stored in contigious memory blocks
* char[1][1][1][4] int [4][4][4][4] double [8][8][8][8]
*/