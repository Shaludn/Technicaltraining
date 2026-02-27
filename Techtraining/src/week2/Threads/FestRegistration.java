package week2.Threads;

public class FestRegistration {
	static class FormFilling extends Thread{
		public void run() {
			System.out.println("FORM FILLING STARTED");
		}
	}
	static class DocumentsUpload extends Thread{
		public void run() {
			System.out.println("Doocument upload started");
		}
	}
	
	static class EmailNotification extends Thread{
		public void run() {
			System.out.println("Confirmation Email sent");
		}
	}
	
	public static void main(String[] args) {
		FormFilling f1=new FormFilling();
		DocumentsUpload d1=new DocumentsUpload();
		EmailNotification e1=new EmailNotification();
		f1.start();
		d1.start();
		e1.start();// thread doesnot provides sequence,, all threads are independent to each other..
	}
	

}

/*Points to Remember
 Java Program starts with one main thread
 Threads allow parallel execution ->concurrency
 Output order isn't guaranteed
 Threads share the same memory.
 It improves the performance and responsiveness.
 ..WHEN start() IS CALLED THE JVM CREATES NEW THREAD.
 ..WHEN run() IS CALLED DIRECTLY, there is no concurrency.
 */

/* "PROCESS VS THREAD"
 * Process is a running program.
 * Thread is a path of execution inside the program.
 * A process has its own memory
 * Thread shares the memory.
 * Creating a thread is cheaper than creating a process
 * Examples: Process -> CHrome Browser Thread -> New Tab
 * Closing a tab will not close Chrome or Kill Chrome
 */
