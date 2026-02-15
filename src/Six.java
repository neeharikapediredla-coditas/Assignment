
/** 6. Problem: Simulate a relay race where each runner (thread) has to wait for the previous
 runner to finish before starting. Use CountDownLatch to ensure that the second runner
 starts only after the first runner finishes, and so on.
 Objective: Learn how to use CountDownLatch to coordinate between threads where
 some threads need to wait for others to finish.*/

import java.util.concurrent.CountDownLatch;
class RelayRunner implements Runnable {
    private final String runnerIdentity;
    private final CountDownLatch previousRunnerSignal;
    private final CountDownLatch nextRunnerSignal;
    public RelayRunner(String runnerIdentity,
                       CountDownLatch previousRunnerSignal,
                       CountDownLatch nextRunnerSignal) {
        this.runnerIdentity = runnerIdentity;
        this.previousRunnerSignal = previousRunnerSignal;
        this.nextRunnerSignal = nextRunnerSignal;
    }
    @Override
    public void run() {
        try {
            if (previousRunnerSignal != null) {
                previousRunnerSignal.await();
            }
            System.out.println(runnerIdentity + " started running");
            Thread.sleep(1000);
            System.out.println(runnerIdentity + " finished running");
            if (nextRunnerSignal != null) {
                nextRunnerSignal.countDown();
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
public class Six {

    public static void main(String[] args) {

        CountDownLatch firstToSecondSignal = new CountDownLatch(1);
        CountDownLatch secondToThirdSignal = new CountDownLatch(1);
        Thread firstRunnerThread = new Thread(
                new RelayRunner("Runner 1", null, firstToSecondSignal));
        Thread secondRunnerThread = new Thread(
                new RelayRunner("Runner 2", firstToSecondSignal, secondToThirdSignal));
        Thread thirdRunnerThread = new Thread(
                new RelayRunner("Runner 3", secondToThirdSignal, null));
        firstRunnerThread.start();
        secondRunnerThread.start();
        thirdRunnerThread.start();
    }
}
