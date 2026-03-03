package week2.Nestedclasses;
//Annonymous innerclass
public interface Payment {
    void pay();
}
class  PaymentDEMO{
    public static void main(String[] args) {
        Payment p=new Payment() {
            //Boilerplate Code
            @Override
            public void pay() {
                System.out.println("Payment done using Credit Card!!!");
            }
        };
        p.pay();

        //SCALA- java 8(Streams, Annotationd, lambdas, refelction
        Payment p1= () -> System.out.println("Cash Payment");
        p1.pay();
    }

        }
/*
POINTS TO REMEMBER
One-time implementation
No need to create seperate class
it is used in events and call back functions
 */