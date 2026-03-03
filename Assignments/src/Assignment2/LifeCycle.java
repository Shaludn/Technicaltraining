package Assignment2;
class LifeCycle extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

 class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        LifeCycle t = new LifeCycle();

        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());

        Thread.sleep(100);
        System.out.println(t.getState());

        t.join();
        System.out.println(t.getState());
    }
}
