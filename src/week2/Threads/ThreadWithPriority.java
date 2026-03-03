package week2.Threads;

public class ThreadWithPriority extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+
                    " | Priority :" + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadWithPriority t1=new ThreadWithPriority();
        ThreadWithPriority t2=new ThreadWithPriority();
        ThreadWithPriority t3=new ThreadWithPriority();
        t1.setName("LowPriorityThread");
        t2.setName("MediumPriorityThread");
        t3.setName("HighPriorityThread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);//1-10 k beech koi bhi value daal do.
        //t3.setPriority(11); IllegalArgumentException
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
⭐POINTS TO REMEMBER
Thread Priority is only a suggestion to the JVM or the scheduler.
Higher priority doesnt guarantee exceution order
Higher priortiy thread can get more cpu time.
The actual behaviour depends on the JVM & OS.
 */
