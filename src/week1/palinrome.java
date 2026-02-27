package week1;

import java.util.*;
class palinrome{
    public static void main(String[] args){
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int ld, r=0, temp=n;
        while(temp!=0){
            ld=temp%10;
            r=(r*10)+ld;
            temp=temp/10;
        }
        temp=n;
        if(n==r){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}