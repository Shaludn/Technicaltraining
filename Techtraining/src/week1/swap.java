package week1;

class swap{
    public static void main(String args[]){
        int a=4; int b=5;
        System.out.println("The number before swapping is:"+ "a :" + " "+a + " b :"+ b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The number afer swapping :"+ a + b);
    }
}