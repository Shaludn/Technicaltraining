package Arrays;

public class E3 {
    public static void main(String[] args) {
        //Types
        int [] arr={1,2,3,4,5};      //1D -array
        int [][] matrix={{1,2,3}      //row 1
                          ,{4,56},     //row2
                          {7,8,9}};    //row3  // 2D -array or Array of arrays -Matrix
        //[3x3] square matrix
        //in 2d array if row length is not same then it is jagged array.

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int[][] jagged={{1,2,20,2},{1,2,3,4,5,6,7},{2,5,6}};
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        for(int r=0; r< jagged.length; r++){
            for (int c=0; c<jagged[r].length; c++){
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }
        for(int[] a:jagged){
            for(int x: a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
