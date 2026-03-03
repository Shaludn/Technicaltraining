package week1;

class pattern2{
    public static void main(String[] args){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}