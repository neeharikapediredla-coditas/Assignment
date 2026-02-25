//7. Write a program that uses unnamed classes and unnamed variables (if available in
//your Java version) to instantiate an anonymous class.

void main() {

    // Anonymous class implementing Runnable
    Runnable task = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running inside anonymous class on: "
                    + Thread.currentThread());
        }
    };

    Thread thread = Thread.ofVirtual().start(task);

    try {
        thread.join();
    } catch (InterruptedException _) { // unnamed variable
        Thread.currentThread().interrupt();
        System.err.println("Thread interrupted.");
    }

    System.out.println("Execution completed.");
}
