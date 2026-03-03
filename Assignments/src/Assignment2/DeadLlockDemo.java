package Assignment2;

public class DeadLlockDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (obj2) {
                    System.out.println("Thread 1 running");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (obj1) {
                    System.out.println("Thread 2 running");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
