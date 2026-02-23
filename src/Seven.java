//7. Write a program that uses unnamed classes and unnamed variables (if available in
//your Java version) to instantiate an anonymous class.

public class Seven {

    public static void main(String[] args) {

        // Anonymous class implementing Runnable
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running inside an anonymous class");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        // Using unnamed variable (_) in a catch block (Java 21+)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred, but variable is intentionally unused");
        }
    }
}