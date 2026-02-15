
/** 7.Problem: Write a program that simulates a resource that can be accessed by multiple
 threads, but only one thread at a time can modify it. Use ReentrantLock to ensure
 that each thread gets exclusive access to the resource.
 Objective: Explore the functionality of ReentrantLock compared to synchronized,
 including features like fairness and lock reentrancy.*/

import java.util.concurrent.locks.ReentrantLock;
class SharedResourceController {
    private final ReentrantLock resourceAccessLock = new ReentrantLock(true);
    private int resourceValue = 0;
    public void modifyResource(String workerIdentity) {
        resourceAccessLock.lock();
        try {
            System.out.println(workerIdentity + " obtained lock");

            int updatedValue = resourceValue + 1;
            Thread.sleep(500);
            resourceValue = updatedValue;

            System.out.println(workerIdentity
                    + " updated resource value to: " + resourceValue);

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            resourceAccessLock.unlock(); // always release lock
            System.out.println(workerIdentity + " released lock");
        }
    }
}
public class Seven {

    public static void main(String[] args) {
        SharedResourceController resourceController = new SharedResourceController();
        Runnable resourceWorker = () -> {
            String executingThreadName = Thread.currentThread().getName();
            resourceController.modifyResource(executingThreadName);
        };
        Thread firstWorkerThread = new Thread(resourceWorker, "Worker-Alpha");
        Thread secondWorkerThread = new Thread(resourceWorker, "Worker-Beta");
        Thread thirdWorkerThread = new Thread(resourceWorker, "Worker-Gamma");
        firstWorkerThread.start();
        secondWorkerThread.start();
        thirdWorkerThread.start();
    }
}
