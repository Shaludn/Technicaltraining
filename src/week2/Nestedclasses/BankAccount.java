package week2.Nestedclasses;

public class BankAccount {
    private double balance=15000;

    //Transaction is a member inner class.
    class Transaction{
        void withdraw(int amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdrawn :" + amount);
            } else{
                System.out.println("Insufficient funds");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        //Syntex: Outerclass.InnerClass innerclass object= outer classobj. new inner clsss constructor.
        BankAccount.Transaction tx= b.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(200);
        System.out.println(b.balance);
    }
}
/*
🛑POINTS TO REMEMBER
transaction belongs to a specific account
Direct access to private variable balance
Clean encapsulation.
 */