//6. Write a program that demonstrates the creation of virtual threads for concurrent
//execution using the Thread.ofVirtual().start().


public class Six {

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running task in: " + threadName);
        };

        // Creating and starting virtual threads
        Thread virtualThread1 = Thread.ofVirtual().start(task);
        Thread virtualThread2 = Thread.ofVirtual().start(task);
        Thread virtualThread3 = Thread.ofVirtual().start(task);

        // Wait for all virtual threads to finish
        virtualThread1.join();
        virtualThread2.join();
        virtualThread3.join();

        System.out.println("All virtual threads completed execution");
    }
}