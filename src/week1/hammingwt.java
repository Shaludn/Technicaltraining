package week1;

import java.util.*;
class numof1s{
    static int c=0;
    int n;
        static int numof1(int n){
            while(n!=0){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
           
        }
        return c;
        }
        public static void main(String[] args){
            numof1(15);
            System.out.println(c);
        
        
    }
}