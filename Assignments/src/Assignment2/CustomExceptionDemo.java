package Assignment2;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void check(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}