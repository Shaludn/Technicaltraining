package week2.Threads;

public class ResultDeclaration {
	synchronized void declareResult() throws Exception{
		System.out.println("Waiting for approval...");
		wait();
		System.out.println("results declared...");
	}
	synchronized void approve() {
		notify();
	}
	
	public static void main(String[] args)throws Exception {
		ResultDeclaration r=new ResultDeclaration();
		new Thread(
				()-> {
					try {
						r.declareResult();
						
						}catch(Exception e) {}
				}).start();
		Thread.sleep(2000);
		new Thread(
				()->
					r.approve()).start();
	}

}

/*
 * The declareResult() method waits until another thread calls notify() method. During wait() the thread releases the
 * lock, allowing other threads to enter the synchronized code.
 * 
 * POINTS TO REMEMBER
 * sleep() ->time based
 * wait()-> conditionn based
 * wait()-> it releases a lock.
 * wait() -> is used in inter-threaded communication.
 * */

//inter-threaded communiction:
//Order Placed->Preparing ->Prepared ->Delivering-> DElivered

