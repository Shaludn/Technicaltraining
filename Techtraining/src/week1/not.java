package week1;

class not{
    public static void main(String[] args){
        int a=~5;
        System.out.println("the output is of ~5 :"+ a );
        //convert the number into binary and then find 2's complement of it that willthe output, with a negative symbol
        System.out.println(5<<1); //formula= 5*2^n times, where n= no of times  left shift should be done.
        System.out.println(5>>1);// formul= 5/2^n times. for right shift.
    }
}