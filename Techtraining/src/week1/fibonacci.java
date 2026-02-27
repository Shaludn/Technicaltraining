package week1;

class fibonacci{
    void fib(int n){
        int a=0; int b=1 ;
        for(int i=1;i<=n;i++){
            System.out.println(a+ " ");
            int fibo=a+b;
            a=b;
            b=fibo;
        }
    }
    public static void main(String[] args){
        fibonacci b=new fibonacci();
        b.fib(6);
    }
    }
