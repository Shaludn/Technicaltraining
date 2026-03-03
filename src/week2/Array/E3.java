package week2.Array;

public class E3 {
    public static void main(String[] args) {
        //Types
        int[] arr={ 1,2,3,4,5}; //1D arraay
        int[][] matrix={{1,2,3},{4,5,6}, {7,8,9}};//2D Array of 3 arrays
        System.out.println(arr.length);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        //Jagged array- in a 2D array when the no of elements in a row is
        //not equal then it is a jagged array.(Irregular arrays)
        int[][] jagged={
                {1,23,4,5,6},
                {3,5},
                {8,9,6}
        };
        System.out.println(jagged[0].length);
        for(int r=0; r<jagged.length; r++){
            for(int c=0; c<jagged[r].length; c++){
                System.out.print(jagged[r][c]+ " ");
            }
            System.out.println();


        }
        for(int[] a: jagged){
            for(int x: a){
                System.out.print(x+ " ");
            }
            System.out.println();
        }

    }
}
