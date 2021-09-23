import java.util.Scanner;

//Custom Exception
class InSufficientAmt extends Throwable { // Thrwoable (Or) Exception use any one to create user defined exception.
    private double amount;

    public InSufficientAmt(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class ExceptionHandlingEx1 {

    public static void main(String[] args) throws InSufficientAmt {
        System.out.println(method());

    }

    static boolean method() {
        try {
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            double amt = in.nextDouble();
            in.close();
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            if (amt < 20) {
                throw new InSufficientAmt(amt);
            }
            return true;
        } catch (InSufficientAmt e) {
            System.out.println(e.getAmount() + " InSufficient Amount");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) { // Common Exception must be at last
            e.printStackTrace();
        } finally {
            System.out.println("Finally executed");
        }
        return false;
    }
}

// output:

// case: 1
    // -1
    // 20
    // java.lang.IllegalArgumentException
    // at ExceptionHandlingEx1.method(ExceptionHandlingEx1.java:28)
    // at ExceptionHandlingEx1.main(ExceptionHandlingEx1.java:18)
    // Finally executed
    // 1

// case: 2
    // 1
    // 15
    // 15.0 InSufficient Amount
    // Finally executed
    // 1


// Hints:-
// ------

// throw is a keyword in java which is used to throw an exception manually.

// throws is also a keyword in java which is used in the method signature to
// indicate that this method may throw mentioned exceptions

// Throwable is a super class for all types of errors and exceptions in java.
// This class is a member of java.lang package
