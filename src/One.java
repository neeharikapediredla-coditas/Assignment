/** 1. Problem: Create a program that simulates a race between 3 runners, each represented
 by a separate thread. The threads should start at the same time and print their progress
 in intervals. The race ends when the first runner completes a fixed number of steps.*/

class Runner implements Runnable {
    private String runnerName;
    private static final int TOTAL_STEPS = 10;
    private static volatile boolean raceCompleted = false;

    public Runner(String runnerName) {
        this.runnerName = runnerName;
    }
    @Override
    public void run() {
        for (int stepNumber = 1;
             stepNumber <= TOTAL_STEPS && !raceCompleted;
             stepNumber++) {

            System.out.println(runnerName + " reached step " + stepNumber);

            try {
                Thread.sleep(300); // simulate running speed
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (stepNumber == TOTAL_STEPS && !raceCompleted) {
                raceCompleted = true;
                System.out.println(runnerName + " wins the race!");
            }
        }
    }
}
public class One {

    public static void main(String[] args) {

        Thread runnerOneThread = new Thread(new Runner("Runner 1"));
        Thread runnerTwoThread = new Thread(new Runner("Runner 2"));
        Thread runnerThreeThread = new Thread(new Runner("Runner 3"));

        // Start all runners at (almost) the same time
        runnerOneThread.start();
        runnerTwoThread.start();
        runnerThreeThread.start();
    }
}
