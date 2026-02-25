//6. Write a program that demonstrates the creation of virtual threads for concurrent
//execution using the Thread.ofVirtual().start().


public class VirtualThreadDemo {

    public static void main(String[] args) {

        System.out.println("Main thread: " + Thread.currentThread());
        Thread vt1 = Thread.ofVirtual().start(() -> performTask("Task-1"));
        Thread vt2 = Thread.ofVirtual().start(() -> performTask("Task-2"));


        try {
            vt1.join();
            vt2.join();
        } 
        catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted.");
        }

        System.out.println("All virtual threads completed.");
    }
    private static void performTask(String taskName) {
        System.out.println(taskName + " started on " + Thread.currentThread());

        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }

        System.out.println(taskName + " completed.");
    }
}
