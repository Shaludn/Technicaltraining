package week1;

import java.util.*;
class automorphic{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        while(temp!=0){
            int r=n*n;
            if(temp%10!= r%10){
                System.out.println(n+ " is not an automorphic number");
            }
            temp/=10;
            r/=10;
        }
    }
}