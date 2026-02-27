package week2.Threads;

public class Tickettask implements Runnable {
	String task;
	Tickettask(String task){
		this.task=task;
	}
	public void run() {
		System.out.println(task + "in prgress");
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Tickettask("Seat assignment"));
		Thread t2=new Thread(new Tickettask("Payment processing"));
		Thread t3=new Thread(new Tickettask("SMS Notification"));
		t1.start();
		t2.start();
		t3.start();
		
		
	
	}

}
/***Points to remember
;-Each Runnable object is a job, and the Thread Class is responsible only
for execution, which makes this approad cleaner and flexible.
Implements Runnable
Better design
Interviewers mostly ask this
Supports multiple inheritance via interfaces.abstract
*/