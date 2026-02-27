package week2.Threads;
//RACE CONDITION......!!!!
public class BankAccount {
	 static int bal=1000;;
	synchronized void withdraw(int amount) {
		bal-=amount;
	}
	
	public static void main(String[] args) throws InterruptedException {
		BankAccount b=new BankAccount();
		Thread t1= new Thread(()-> b.withdraw(500));
		Thread t2= new Thread(()-> b.withdraw(500));
		t1.start();
		t2.start();
		t1.join();//join() will make sure that the main threadwaits for child threads to complete.
		t2.join();
		System.out.println("Final balance: "+ bal);
		
	}

}
