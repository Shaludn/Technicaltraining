package week1;

class strongmetho{

    int fact(int r){
        for(i=1;i<=ld;i++){
            int r=1;
            r*=i;
    }
    return r;
    }
    boolean isstrong(int n){
        int temp=n, sum=0;
        while(n!=0){
          int ld=n%10;
          sum+=fact(r);
          n=n/10;
          }  
          if(n==sum){
            return true;
          }
          else{
            return false;
          }
        }
        public static void main(String[] args){
            strongmethod m=new strongmethod();
            m.isstrong(145);

        }
    }
