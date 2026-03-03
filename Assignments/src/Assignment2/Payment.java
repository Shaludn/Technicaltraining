package Assignment2;

public interface Payment {
    void pay();
}
class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment  Done using Creditcard");
    }
}

class UPIPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

class Demo{
    public static void main(String[] args) {
        CreditCardPayment cd=new CreditCardPayment();
        UPIPayment up1=new UPIPayment();
        cd.pay();
        up1.pay();
    }
}
