package week2.Threads;
import java.io.*;
import java.net.BindException;
public class SleepExample {
	public static void main(String[] args) throws InterruptedException{
		
	
	System.out.println("Printing 0-9");
	for(int i=0;i<10;i++) {
		System.out.println("Printed:"  + i);
		Thread.sleep(3000);
}
	System.out.println("Done!!!!");

}
}
/*Here the thread is paused for a fixed duratipm of time.
 * The thread doesnt lack anything and resumes after the given time.
 * */
