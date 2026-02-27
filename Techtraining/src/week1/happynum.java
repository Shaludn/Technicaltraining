package week1;

import java.util.*;
class happynum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ld, temp=n;
        while(temp!=1 && temp!=4){
        int a=0;
        while(temp>0){
            ld=temp%10;
            a+=ld*ld;
            temp=temp/10;

        }
        temp=a;
        }
        if(temp==1){
            System.out.println("Happy number");

        }
        else{
            System.out.println("Ugly number");
        }
    }
}