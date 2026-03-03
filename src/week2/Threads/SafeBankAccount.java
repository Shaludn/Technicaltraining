package week2.Threads;

public class SafeBankAccount {
        static int bal=1000;;
        synchronized void withdraw(int amount) {
            bal-=amount;
        }

        public static void main(String[] args) throws InterruptedException {
            week2.Threads.BankAccount b=new week2.Threads.BankAccount();
            Thread t1= new Thread(()-> b.withdraw(500));
            Thread t2= new Thread(()-> b.withdraw(500));
            t1.start();
            t2.start();
            t1.join();//join() will make sure that the main threadwaits for child threads to complete.
            t2.join();
            System.out.println("Final balance: "+ b.bal);

        }

    }
/*
Both threads t1 and t2 access and modify the ssamne balannce variable simaltaneously,
Due tto lack of synchroixation, the final balance becomes incosistent.

Points to remember
Shared data causes iSSUES
Execution order is unpredictable
Leads to data inconsistnently
Need synchronization to solve RACE CONDITION...
 */

/*Code Explaination:
The synnchronized keyword makes sure that only one withdraw() method is exceuted at a time,
preventing RACE CONDITION, and ensuring correct balance deduction.

POINTS TO REMEMBER
Synchronization avoids Race conditoion
Locks criticsl section in an apllication
Slower but safe
Essential far shared resources.
 */