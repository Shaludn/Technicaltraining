package week1;

import java.util.Scanner;
class armstrong{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ld, a=0; int temp=n, c=0;
        while(temp!=0){
            c++;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0){
            ld=temp%10;
            a+=Math.pow(ld, c);
            temp=temp/10;
        }
        if(n==a){
            System.out.println("The number is an armstrong number:" + a );
        }
        else{
            System.out.println("Not an armstorng number:"+ a);
        }
    }
}