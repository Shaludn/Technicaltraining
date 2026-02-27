package week1;

//Method Overloading.
class bank{
    void interest(){
        System.out.println("Banks applies a lot of interests on loan");
    }
}

public class sbi extends bank{
    double interest(double rate){
        return rate;
    }

    double interest(double rate, int years){
        return rate*years;
    }

    public static void main(String[] args){
        sbi s=new sbi();
        s.interest();
       
        System.out.println("The rate of interest is :" +  s.interest(10.8)+ "%");
        
       
        System.out.println(s.interest(10.8, 4));
    }
}