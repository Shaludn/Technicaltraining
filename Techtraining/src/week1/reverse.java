package week1;

import java.util.*;
class reverse{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("The number is:\n ");
        int n=s.nextInt();
        int rev=0; int ld;
        while(n!=0){
            ld=n%10;
            rev=(rev*10)+ld;
            
            n=n/10;
        }
        System.out.println(rev);

    }
}