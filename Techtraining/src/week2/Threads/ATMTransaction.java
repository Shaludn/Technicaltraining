package week2.Threads;

public class ATMTransaction extends Thread {
	public void run() {
		System.out.println("Processing ATM Transaction");
	}
	public static void main(String[] args) {
		ATMTransaction t= new ATMTransaction();
		System.out.println("Thread state:"+ t.getState());//NEW
		t.start();
		System.out.println("Thread state after start :"+ t.getState()); //RUNNABLE
	}

}
/* Initially the thread is in the NEW state. After calling start(),
it moves to RUNNABLE and exceutes the run() method.
The exact timing of the state changes depends on the JVM Scheduler.
*/