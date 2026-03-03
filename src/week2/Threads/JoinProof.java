package week2.Threads;

public class JoinProof {
    static class Task extends Thread{
        public void run(){
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
                System.out.println("Task finished!!");

        }
    }

    public static void main(String[] args) throws Exception{
        Task t=new Task();
        t.start();// THE main thread doesnt wait for this thread
        t.join();// Code will wait(Guaranteed)
        System.out.println("Main thread Resumes!!!!");
    }
}
