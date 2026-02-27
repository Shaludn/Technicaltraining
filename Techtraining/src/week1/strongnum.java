package week1;

import java.util.*;
class strongnum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ld, i,a=0, temp=n;
        while(temp!=0){
            ld=temp%10;
            int r=1;
            for(i=1;i<=ld;i++){
                r*=i;
            }
            a+=r;
            temp=temp/10;
        }
        temp=n;
        System.out.println(a);
        if(n==a){
            System.out.println("it is a strong number");
        }
        else{
            System.out.println("It is a weak number");
        }
    }
}