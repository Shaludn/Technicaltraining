package Assignment2;
class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class AgeCheck {
    static void validate(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
