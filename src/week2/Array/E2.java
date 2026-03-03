package week2.Array;

public class E2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);
        //Access & Update elementsin a array -> TC O(1)
        //THis is because index based access or direct index mapping.
        //[idx= pos-1] or[pos= idx+1]
        //length is a property
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        for(Object o : arr){
            System.out.print(o + "  ");
        }
        System.out.println();
        String name="Java";
        System.out.println(name.length());
    }
}
/*
Memory management
Array object is stored in the Heap
Variable reference is stored in stack.
Elements are stored in contiguos memory blocks
char[1][1][1][1] int[4][4][4][4] double[8][8][8][8]
 */
