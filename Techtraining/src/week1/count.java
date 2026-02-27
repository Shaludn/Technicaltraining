package week1;

import java.util.Scanner;
class count{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        System.out.println("The no:" + n);
        int c=0;
        if(n==0){
            System.out.println("Count is 1");
        }
        else{
            while(n!=0){
            c++;
            n=n/10;
        }
        }
        System.out.println("count:"+ c);
    }
}