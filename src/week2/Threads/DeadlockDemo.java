package week2.Threads;

public class DeadlockDemo {
    static final Object o1=new Object();
    static final Object o2=new Object();

    public static void main(String[] args) {
        Thread t1= new Thread(() -> {
            synchronized (o1) { //Object class method is written like this.
                System.out.println("Thread 1 locked Account A");
                try{
                    Thread.sleep(2000);

                }catch(Exception e) {}

                synchronized (o2) {
                    System.out.println("Thread 1 locked Account B");
                }
            }
        });
        Thread t2=new Thread(() -> {
            synchronized (o2) {
                System.out.println("Thread 2 locked Account A");
                try{
                    Thread.sleep(2000);

                }catch(Exception e) {}
                synchronized (o1) {
                    System.out.println("Thread 2 locked Account B");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread-1 acquires a lock on Account A and then sleeps , giving
Thread -2 to acquires a lock on Account B. Now, Thread-1 waits for
Account A & Thread-2 Waits for Account B. since neither threadd releases
the lock, both keep waiitng and creating a DEADLOCK

DEADLOCK EXPLAINATION:
Deadlock occurs when each thread is holding a resource and waiting for the other to
release it.
 */