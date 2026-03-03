package Assignment2;

public class GCDemo {

        public static void main(String[] args) {
            GCDemo o =new GCDemo();
            o=null;
            System.gc();
            System.out.println("GC Requested!!!");
        }
    }

