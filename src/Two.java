/**2. Problem: Implement a counter that can be accessed by two threads: one thread
 increments the counter, and another thread reads its value.
 Objective: Demonstrate the effect of the volatile keyword in ensuring variable
 visibility between threads.*/

class SharedCounter {
    private volatile int counterValue = 0;
    public void incrementCounter() {
        counterValue++;
        System.out.println("Increment Thread updated counter to: " + counterValue);
    }
    public void readCounter() {
        System.out.println("Reader Thread sees counter as: " + counterValue);
    }
}
public class Two {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        Thread counterIncrementThread = new Thread(() -> {
            for (int iteration = 1; iteration <= 5; iteration++) {
                sharedCounter.incrementCounter();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
        Thread counterReadThread = new Thread(() -> {
            for (int iteration = 1; iteration <= 5; iteration++) {
                sharedCounter.readCounter();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
        counterIncrementThread.start();
        counterReadThread.start();
    }
}
